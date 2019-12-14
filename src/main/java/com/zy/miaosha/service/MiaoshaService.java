package com.zy.miaosha.service;

import com.zy.miaosha.domain.MiaoshaUser;
import com.zy.miaosha.domain.OrderInfo;
import com.zy.miaosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MiaoshaService {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private OrderService orderService;

    @Transactional
    public OrderInfo miaosha(MiaoshaUser user, GoodsVo goods){
        //减库存，下订单，写入秒杀订单
        goodsService.reduceStock(goods);
        return orderService.createOrder(user,goods);
    }
}
