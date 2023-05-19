package com.kbstar.controller;

import com.kbstar.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AjaxImplController {

    @Autowired
    ReviewService reviewService;
//
//
//    @RequestMapping("/cust/review/delete")
//    public void deleteReview(Integer id) throws Exception{
//        reviewService.remove(id);
//    }

        @RequestMapping("/cust/review/update")
        public void deleteReview(Integer id) throws Exception{
            reviewService.updateIshidden(id);
        }

        @RequestMapping("/cust/review/delete")
        public void deleteConfirmed() throws Exception{
            reviewService.removeAll();
        }

        @RequestMapping("/cust/review/revive")
        public void reviveAll() throws Exception{
            reviewService.reviveAll();
        }

}
