




package com.kbstar.controller;

import java.util.List;
import java.util.Map;

import com.kbstar.service.CalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



    @Controller
    @RequestMapping("/schedule")
    public class CalenderController {



        @RequestMapping //기본 페이지 표시
        public String viewCalender(){
            return "/calenderPage";
        }


            @RequestMapping("/schedule")
    public String calender(Model model){
        model.addAttribute("center","calender");
        return "index";
    }
//
//        @GetMapping("/event") //ajax 데이터 전송 URL
//        public @ResponseBody List<Map<String, Object>> getEvent(){
//            return calenderService.getEventList();
//        }

    }




