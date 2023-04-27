package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.dto.Marker;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class AjaxImplController {
    @RequestMapping("/getservertime")
    public Object getservertime(){
        Date date = new Date();
        return date;

    }

    @RequestMapping("/getdata")
    public Object getdata(){
        List<Cust> list = new ArrayList<>();
        list.add(new Cust("id01","pwd01","james1"));
        list.add(new Cust("id02","pwd02","james2"));
        list.add(new Cust("id03","pwd03","james3"));
        list.add(new Cust("id04","pwd04","james4"));
        list.add(new Cust("id05","pwd05","james5"));

       //java object ---> JSON.
        //JSON (JAVASCRIPT OBJECT NOTATION)
        // [{},{},{},...]
        JSONArray ja = new JSONArray(); //배열만든다
        //디비의 데이터를 제이슨으로 바꿔서.
        for(Cust obj:list){
            JSONObject jo = new JSONObject(); // json객체 만든다.

            Random r = new Random();
            int i = r.nextInt(100) +1;
            jo.put("id",obj.getId());
            jo.put("pwd",obj.getPwd());
            jo.put("name",obj.getName()+i);
            ja.add(jo);
        }
        return ja;

    }



    @RequestMapping("/checkid")
    public Object checkid(String id){
        int result = 0;

        if(id.equals("qqq") || id.equals("aaa")|| id.equals("sss")) {
            result = 1;
        }
        return result;

    }

    @RequestMapping("/chart05")
    public Object chart05(String year){
      JSONArray ja = new JSONArray();
      for(int i=1; i<=12; i++){
          Random r = new Random();
          int num = r.nextInt(100)+1;
          ja.add(num);
      }
        return ja;

    }



    @RequestMapping("/markers")
    public Object markers(String loc){
        List<Marker> list = new ArrayList<>();
        if(loc.equals("s")){
            list.add(new Marker(100,"국밥","http://www.nate.com",37.5118405 , 127.5276091 ,"b.jpg","s" ));
            list.add(new Marker(101,"피자","http://www.naver.com",37.2118405 , 127.4176091 ,"c.jpg","s" ));
            list.add(new Marker(102,"리자","http://www.daum.com",37.7118405 , 127.2176091 ,"d.jpg","s" ));
        }else if(loc.equals("b")){
            list.add(new Marker(103,"국밥","http://www.nate.com", 37.5704247 ,   127.0077575 ,"b.jpg","b" ));
            list.add(new Marker(104,"피자","http://www.naver.com",31.5704247  , 126.0077575,"c.jpg","b" ));
            list.add(new Marker(105,"리자","http://www.daum.com",39.7118405 , 122.2176091 ,"d.jpg","b" ));

        }else if(loc.equals("j")){
            list.add(new Marker(106,"국밥","http://www.nate.com",35.5118405 , 126.5276091 ,"b.jpg","j" ));
            list.add(new Marker(107,"피자","http://www.naver.com",37.5118405 , 127.2176091 ,"c.jpg","j" ));
            list.add(new Marker(108,"리자","http://www.daum.com",36.7518405 , 128.2476091 ,"d.jpg","j" ));
        }


         JSONArray ja = new JSONArray();
        for(Marker obj: list){
            JSONObject jo = new JSONObject();
            jo.put("id",obj.getId());
            jo.put("title",obj.getTitle());
            jo.put("target",obj.getTarget());
            jo.put("lat",obj.getLat());
            jo.put("lng",obj.getLng());
            jo.put("img",obj.getImg());
            jo.put("loc",obj.getLoc());
            ja.add(jo);
        }

         return ja;

    }
}
