package com.wh.sys.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import com.wh.sys.entity.User;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends User {

    private Integer page=1;
    private Integer limit=10;

    /**
     * 验证码
     */
    private String code;
}
