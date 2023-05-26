package com.kbstar.mapper;

import com.kbstar.dto.Calender;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper

public interface CalenderMapper extends KBMapper<String, Calender> {

//    List<Calender> getCalender() throws Exception {
        List<Calender> calender = null;
//        return calender;


    }


