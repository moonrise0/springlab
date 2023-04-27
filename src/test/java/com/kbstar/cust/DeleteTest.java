package com.kbstar.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class DeleteTest {

    @Autowired
    CustService service;
    @Test
    void contextLoads() {
        List<Cust> list = null;

        try {
            service.remove("id10");
                log.info("삭제완료");
        } catch (Exception e) {
                log.info("시스템 장애입니다.");
            }

        }
    }

