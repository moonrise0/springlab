package com.kbstar.ncp;

import com.kbstar.util.ChatBotUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Random;

@Slf4j
@SpringBootTest
public class ChatbotTest {



    @Test
    void contextLoad() throws IOException {
        String txt =
                "채팅하자";
        String result = ChatBotUtil.chat(txt);
        log.info("=========================");
        log.info("result");
        log.info("=========================");



    }
}
