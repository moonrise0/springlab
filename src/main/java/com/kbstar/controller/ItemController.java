package com.kbstar.controller;


import com.kbstar.dto.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/item")
public class ItemController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());


    String dir = "item/";
    //127.0.0.1/item 하면 밑에게 호출.
   @RequestMapping("")
    public String main(Model model){
       model.addAttribute("left", dir+"left");
       model.addAttribute("center", dir+"center");
       return "index";
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("left", dir+"left");
        model.addAttribute("center", dir+"add");
        return "index";
    }


    @RequestMapping("/all")
    public String all(Model model){
        List<Item> list = new ArrayList<>();


        model.addAttribute("allItem", list);
        //모델에 리스트를 담는다. 이미지 이름만 데이터에 들어가고, 사진은 특정 폴더에 들어간다. 컨트롤러는 데이터 가져와서 화면 만들어라.

        model.addAttribute("left", dir+"left");
        model.addAttribute("center", dir+"all");
        return "index";
    }
}



//        list.add(new Item(100,"pants1",1000,"a.jpg",SYSDATE));
//        list.add(new Item(101,"pants2",2000,"b.jpg",SYSDATE));
//        list.add(new Item(102,"pants3",3000,"c.jpg",SYSDATE));
//        list.add(new Item(103,"pants4",4000,"d.jpg",SYSDATE));
//        list.add(new Item(104,"pants5",5000,"e.jpg",SYSDATE));