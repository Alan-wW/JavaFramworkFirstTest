package com.exam.dao;

import com.exam.entity.Goodsexam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsexamDao {
    @Select("select * from GoodsExam")
    List<Goodsexam> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsexam record);

    int insertSelective(Goodsexam record);

    Goodsexam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsexam record);

    int updateByPrimaryKey(Goodsexam record);

    List<Goodsexam> selectByCategory(String category);
}