package com.kbstar.mapper;

import com.github.pagehelper.Page;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustMapper extends KBMapper<String, Cust> {
    Page<Cust> getpage() throws Exception;

}
