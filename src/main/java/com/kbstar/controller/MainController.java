package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Slf4j
@Controller
public class MainController {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    CustService custService;


    @RequestMapping("/")
    public String main() {
        return "index";
    }



    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("center", "login");
        return "index";
    }

    @RequestMapping("/custinfo")
    public String custinfo(Model model,String id) throws Exception {
        Cust cust = null;
        try {
            cust = custService.get(id);
        } catch (Exception e) {
            throw new Exception("시스템장애");
        }
        model.addAttribute("custinfo", cust); //뿌릴 정보를 준비
        model.addAttribute("center", "custinfo"); //센터페이지에 custinfo뿌림
        return "index";
    }

    @RequestMapping("/custinfoimpl")
    public String custinfoimpl(Model model, Cust cust) throws Exception {

        try {
//            log.info("------------------------------------------" + cust.getPwd());
//            cust.setPwd(encoder.encode(cust.getPwd()));
            custService.modify(cust);   //비밀번호 그대로 들어감으로
        } catch (Exception e) {
            throw new Exception("시스템장애");
        }
          return "redirect:/custinfo?id="+cust.getId();
    }


    @RequestMapping("/logout")
    public String logout(Model model , HttpSession session) {
        if(session != null){
            session.invalidate();
        }
        return "index";
    }
    @RequestMapping("/loginimpl")
    public String loginimpl(Model model, String id, String pwd, HttpSession session) throws Exception {

        Cust cust = null;
        String nextPage = "loginok";
        try {
            cust = custService.get(id);
            if (cust != null  && encoder.matches(pwd, cust.getPwd()) ){
                nextPage = "loginok";
                session.setMaxInactiveInterval(100000);
                session.setAttribute("logincust" , cust);
            }

        } catch (Exception e){
            throw new Exception("시스템 장애");
        }


        model.addAttribute("center", nextPage);
        return "index";
    }
    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("center", "register");
        return "index";


    }
    @RequestMapping("/registermpl")
    public String registerimpl(Model model, Cust cust, HttpSession session) throws Exception{
        try {
//            cust.setPwd(encoder.encode(cust.getPwd()));
            custService.register(cust);
            session.setAttribute("logincust", cust);
        } catch (Exception e) {

            throw new Exception("가입 오류");
        }
        model.addAttribute("rcust", cust); //세션에 담은 정보도 jsp를 통해 꺼낼 수 있다.
        model.addAttribute("center", "registerok");
        return "index";
    }

    // /quics?page=bs01
    @RequestMapping("/quics")
    public String quics(String page) {
        return page;
    }
}