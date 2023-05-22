package com.kbstar.controller;

import com.kbstar.dto.Ncp;
import com.kbstar.util.CFRCelebrityUtil;
import com.kbstar.util.CFRFaceUtil;
import com.kbstar.util.FileUploadUtil;
import com.kbstar.util.OCRUtil;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class NcpController {


    @Value("${uploadimgdir}")
    String imgpath;

    @Autowired
    CFRCelebrityUtil celebrityUtil;

    @Autowired
    CFRFaceUtil cfrFaceUtil;

    @RequestMapping("/cfr1imp")
    public String cfr1imp(Model model, Ncp ncp) throws ParseException {
        //이미지를 서버에 저장하고
        FileUploadUtil.saveFile(ncp.getImg(), imgpath);

        //ncp에 요청한다
        String imgname = ncp.getImg().getOriginalFilename();
        // 결과를 받는다.
        JSONObject result =
                (JSONObject)celebrityUtil.getResult(imgpath, imgname);
        log.info(result.toJSONString());

        JSONArray faces = (JSONArray) result.get("faces"); //result에서 face를 꺼냇더니 array
        JSONObject obj = (JSONObject) faces.get(0); //배열에서 0번째를 뽑으면 json object
        JSONObject celebrity = (JSONObject) obj.get("celebrity"); //배열에서 셀레브리티뽑으면 json object
        String values = (String) celebrity.get("value");//(셀레브리트에서 밸류를 빼니 스트링 밸류)


        model.addAttribute("result", "value");
        model.addAttribute("center", "cfr1");

        return "index";
    }


    @RequestMapping("/cfr2imp")
    public String cfr2imp(Model model, Ncp ncp) throws ParseException {
        //이미지를 서버에 저장하고
        FileUploadUtil.saveFile(ncp.getImg(), imgpath);

        //ncp에 요청한다
        String imgname = ncp.getImg().getOriginalFilename();
        // 결과를 받는다.
        JSONObject result =
                (JSONObject)cfrFaceUtil.getResult(imgpath, imgname);
        log.info(result.toJSONString());

        String emotion_value = "";
        String gender_value = "";
        String pose_value = "";
        String age_value = "";

        JSONArray faces = (JSONArray) result.get("faces"); //result에서 face를 꺼냇더니 array
        JSONObject obj = (JSONObject) faces.get(0); //배열에서 0번째를 뽑으면 json object

        JSONObject gender = (JSONObject) obj.get("gender"); //배열에서 셀레브리티뽑으면 json object
        gender_value = (String) gender.get("value");//(셀레브리트에서 밸류를 빼니 스트링 밸류)


        JSONObject age = (JSONObject) obj.get("age");
        age_value = (String) age.get("value");

        JSONObject emotion = (JSONObject) obj.get("emotion");
        emotion_value = (String) emotion.get("value");

        JSONObject pose = (JSONObject) obj.get("pose");
        pose_value = (String) pose.get("value");

        Map<String, String> map = new HashMap<>();
        map.put("emotion", emotion_value);
        map.put("pose", pose_value);
        map.put("age", age_value);
        map.put("gender", gender_value);
        //맵에다가 key 밸류 , key 밸류 넣는다.

        model.addAttribute("result", map);
        //결과를  map에다 넣기로 함.
        model.addAttribute("center", "cfr2");
        return "index";
    }


    @RequestMapping("/mycfr")
    public String mycfr(Model model, String imgname) throws ParseException {

        JSONObject result =
                (JSONObject)cfrFaceUtil.getResult(imgpath, imgname);
        log.info(result.toJSONString());

        String emotion_value = "";
        String gender_value = "";
        String pose_value = "";
        String age_value = "";

        JSONArray faces = (JSONArray) result.get("faces"); //result에서 face를 꺼냇더니 array
        JSONObject obj = (JSONObject) faces.get(0); //배열에서 0번째를 뽑으면 json object

        JSONObject gender = (JSONObject) obj.get("gender"); //배열에서 셀레브리티뽑으면 json object
        gender_value = (String) gender.get("value");//(셀레브리트에서 밸류를 빼니 스트링 밸류)


        JSONObject age = (JSONObject) obj.get("age");
        age_value = (String) age.get("value");

        JSONObject emotion = (JSONObject) obj.get("emotion");
        emotion_value = (String) emotion.get("value");

        JSONObject pose = (JSONObject) obj.get("pose");
        pose_value = (String) pose.get("value");

        Map<String, String> map = new HashMap<>();
        map.put("emotion", emotion_value);
        map.put("pose", pose_value);
        map.put("age", age_value);
        map.put("gender", gender_value);
        //맵에다가 key 밸류 , key 밸류 넣는다.

        model.addAttribute("result", map);
        //결과를  map에다 넣기로 함.
        model.addAttribute("center", "pic");
        return "index";
    }

    @RequestMapping("/ocr1impl")
    public String ocr1impl(Model model, Ncp ncp) {
        //이미지를 서버에 저장하고\
        FileUploadUtil.saveFile(ncp.getImg(), imgpath);

        //ncp에 요청한다
        String imgname = ncp.getImg().getOriginalFilename();
        // 결과를 받는다.
        JSONObject result =
                (JSONObject) OCRUtil.getResult(imgpath, imgname);
        Map map = OCRUtil.getData(result);
        model.addAttribute("result", map);
        model.addAttribute("center", "ocr1");

        return "index";

    }
//
//    @RequestMapping("/ocrbapl1impl")
//    public String ocrbapl1impl(Model model, Ncp ncp) throws Exception{
//        //이미지 저장한다.
//        FileUploadUtil.saveFile(ncp.getImg(),imgpath);
//        //NCP에 요청한다.
//        String imgname = ncp.getImg().getOriginalFilename();
//        JSONObject result = (JSONObject) OCRBaplUtil.getResult(imgpath, imgname);
//        Map<String, String> map = new HashMap<>();
//        map = OCRBaplUtil.getData(result);
//
////결과를 jsp에 뿌린다.
//        model.addAttribute("result", map);
////결과를 받는다.
//        model.addAttribute("center", "ocrbapl1");
//        return "index";
//    }

    }
