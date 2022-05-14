package com.exam.controller;

import com.exam.dao.GoodsexamDao;
import com.exam.entity.Goodsexam;
import com.exam.service.GoodsService;
import com.exam.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 邢彬
 * @Date: 2022/05/13/09:59
 * @Description:
 */
@Controller
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getGoods")
    @ResponseBody
    public List<Goodsexam> getGoods(){
        List<Goodsexam> goodsexam = goodsService.selectAll();
        return goodsexam;
    }

    @GetMapping("/getGoodsBycategory")
    @ResponseBody
    public List<Goodsexam> getGoodsByCategory(@RequestParam("category") String category){
        List<Goodsexam> goodsexams = goodsService.selectByCategory(category);
        return goodsexams;
    }
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsServiceImpl();
        System.out.println(goodsService.selectByPrimaryKey(1));
    }
}
