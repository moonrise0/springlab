package com.kbstar.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;

@Slf4j
@SpringBootTest
class InsertTests {

    @Autowired
    CustService service;
    @Test
    void contextLoads() {
        Cust obj = new Cust("id20","pwd01","james10");
        try {
            service.register(obj);
            log.info("register OK.......");
        } catch (Exception e) {
            if(e instanceof DuplicateKeyException){
                log.info("id가 중복되었습니다.---------------");
            }else{
                log.info("시스템 장애입니다.");
            }

//            log.info("register error.......");
//            e.printStackTrace();
        }
    }

}