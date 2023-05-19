package com.kbstar.review;

import com.kbstar.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class DeleteAllTest {
    @Autowired
    ReviewService service;
    @Test
    void contextLoads() {
        try {
            service.removeAll();
        } catch (Exception e) {
            e.printStackTrace();
            log.info("에러..");
        }
    }
}
