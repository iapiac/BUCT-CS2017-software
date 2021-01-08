package com.wh.sys.vo;

import com.wh.sys.entity.Permission;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionVo extends Permission {

    private Integer page=1;
    private Integer limit=10;
}
