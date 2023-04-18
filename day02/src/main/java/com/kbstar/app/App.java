package com.kbstar.app;

import com.kbstar.frame.*;
import com.kbstar.tv.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[]){
            ApplicationContext factory =
                    new ClassPathXmlApplicationContext("spring.xml"); //판때기만들고

            TV tv = (TV) factory.getBean("stv");  //stv라는 것을 찾고 왼쪽으로 역주입시켰다.
               tv.turnOn();



        }
    }

