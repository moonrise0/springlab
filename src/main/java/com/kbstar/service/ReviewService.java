package com.kbstar.service;

import com.kbstar.dto.Review;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements KBService<Integer, Review> {
    @Autowired
    ReviewMapper mapper;
    @Override
    public void register(Review review) throws Exception {
        mapper.insert(review);
    }
    @Override
    public void remove(Integer id) throws Exception {
        mapper.delete(id);
    }
    @Override
    public void modify(Review review) throws Exception {
        mapper.update(review);
    }

    @Override
    public Review get(Integer id) throws Exception {
        return mapper.select(id);
    }
    @Override
    public List<Review> get() throws Exception {
        return mapper.selectall();
    }
    public void removeAll() throws Exception{
        mapper.deleteall();
    }
    public void reviveAll() throws Exception{
        mapper.reviveall();
    }
    public void updateIshidden(Integer i) throws Exception{
        mapper.updateisHidden(i);
    }

}