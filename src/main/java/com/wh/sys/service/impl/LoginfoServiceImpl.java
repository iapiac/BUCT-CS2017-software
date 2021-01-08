package com.wh.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wh.sys.entity.Loginfo;
import com.wh.sys.mapper.LoginfoMapper;
import com.wh.sys.service.ILoginfoService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements ILoginfoService {

}
