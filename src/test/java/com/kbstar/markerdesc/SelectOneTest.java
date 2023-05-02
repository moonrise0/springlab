package com.kbstar.markerdesc;

import com.kbstar.dto.MarkerDesc;
import com.kbstar.service.MarkerDescService;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SelectOneTest {
    @Autowired
    MarkerDescService service;
    @Test
    void contextLoads() throws Exception {
        try {
            service.get(11);
            log.info("셀렉 정상");
        } catch (Exception e) {
            log.info("셀렉 에러..");
        }
    }
}