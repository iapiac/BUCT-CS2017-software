package com.wh.bus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.bus.entity.Customer;


public interface ICustomerService extends IService<Customer> {

    /**
     * 根据客户id删除客户
     * @param id    客户id
     */
    void deleteCustomerById(Integer id);
}
