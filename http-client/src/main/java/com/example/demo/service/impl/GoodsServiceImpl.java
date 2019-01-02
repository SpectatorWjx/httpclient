package com.example.demo.service.impl;

import com.example.demo.domain.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author wjx
 * @Date:2019/1/2
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    @Override
    public List<Goods> getGoods() {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("大米");
        goods.setCreateTime(new Date());
        return Arrays.asList(goods);
    }
}
