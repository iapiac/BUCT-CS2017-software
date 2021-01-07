package com.wh.bus.vo;

import com.wh.bus.entity.Goods;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsVo extends Goods {

    private Integer page=1;
    private Integer limit=10;

}
