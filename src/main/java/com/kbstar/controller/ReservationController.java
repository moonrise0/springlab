//package com.kbstar.controller;
//
//import com.kbstar.service.ReservationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class ReservationController {
//    @Autowired
//    private ReservationService reservationService;
//
//    @PostMapping("/confirmReservation")
//    public String confirmReservation(@RequestParam("eventId") int eventId, @RequestParam("newDate") String newDate) {
//        ReservationDTO reservationDTO = new ReservationDTO(eventId, newDate);
//        reservationService.confirmReservation(reservationDTO);
//        return "redirect:/reservationList"; // 예약 확정 후 이동할 페이지
//    }
//}