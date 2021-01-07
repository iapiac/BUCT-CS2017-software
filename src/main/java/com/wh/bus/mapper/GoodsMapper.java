package com.wh.bus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wh.bus.entity.Goods;

import org.apache.ibatis.annotations.Param;


public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * 根据商品id删除商品销售信息
     * @param id1
     */
    void deleteSaleByGoodsId(@Param("goodsid") Integer id1);

    /**
     * 根据商品id删除商品销售退货信息
     * @param id1
     */
    void deleteSaleBackByGoodsId(@Param("goodsid") Integer id1);

    /**
     * 根据商品id删除商品进货信息
     * @param id
     */
    void deleteInportByGoodsId(@Param("goodsid") Integer id);


    /**
     * 根据商品id删除商品退货信息
     * @param id
     */
    void deleteOutportByGoodsId(@Param("goodsid") Integer id);

    /**
     * 根据客户id删除商品销售
     * @param id    客户id
     */
    void deleteSaleByCustomerId(Integer id);

    /**
     * 根据客户id删除商品销售退货信息
     * @param id    客户id
     */
    void deleteSaleBackByCustomerId(Integer id);

}
