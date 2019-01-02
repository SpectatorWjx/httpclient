package com.example.demo.controller;

import com.example.demo.common.Render;
import com.example.demo.domain.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wjx
 * @Date:2019/1/2
 * @Description:
 */
@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("getGoods")
    @ResponseBody
    public Render getGoods(){
        return Render.success(goodsService.getGoods());
    }
}
