package com.kbstar.dto;

public class ReservationDTO {
    private int eventId;
    private String newDate;

    // Getter 및 Setter 생략

    // 생성자
    public ReservationDTO() {
    }

    public ReservationDTO(int eventId, String newDate) {
        this.eventId = eventId;
        this.newDate = newDate;
    }
}