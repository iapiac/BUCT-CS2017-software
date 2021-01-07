package com.wh.bus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.bus.entity.Provider;


public interface IProviderService extends IService<Provider> {

    /**
     * 根据供应商ID删除供应商
     * @param id
     */
    void deleteProviderById(Integer id);
}
