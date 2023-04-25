package com.kbstar.dto;


import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    private int id;
    private String pwd;
    private int price;
    private String imgname;
    private Date regdate;
}
