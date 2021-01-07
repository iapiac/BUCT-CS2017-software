package com.wh.bus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.bus.entity.Goods;


public interface IGoodsService extends IService<Goods> {

    /**
     * 根据商品id删除商品
     * @param id
     */
    void deleteGoodsById(Integer id);
}
