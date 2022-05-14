package com.exam.service;

import com.exam.entity.Goodsexam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: 邢彬
 * @Date: 2022/05/13/09:59
 * @Description:
 */
public interface GoodsService {

    List<Goodsexam> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Goodsexam record);

    int insertSelective(Goodsexam record);

    Goodsexam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsexam record);

    int updateByPrimaryKey(Goodsexam record);

    List<Goodsexam> selectByCategory(String category);
}
