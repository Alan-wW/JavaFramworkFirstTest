package com.exam.service.impl;

import com.exam.dao.GoodsexamDao;
import com.exam.entity.Goodsexam;
import com.exam.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 邢彬
 * @Date: 2022/05/13/10:00
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsexamDao dao;

    @Override
    public List<Goodsexam> selectAll() {
        return dao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Goodsexam record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Goodsexam record) {
        return dao.insertSelective(record);
    }

    @Override
    public Goodsexam selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Goodsexam record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goodsexam record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public List<Goodsexam> selectByCategory(String category) {
        return dao.selectByCategory(category);
    }
}
