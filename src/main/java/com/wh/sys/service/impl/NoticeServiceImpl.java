package com.wh.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wh.sys.entity.Notice;
import com.wh.sys.mapper.NoticeMapper;
import com.wh.sys.service.INoticeService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
