package com.wh.sys.vo;

import com.wh.sys.entity.Dept;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
public class DeptVo extends Dept {

    private Integer page=1;
    private Integer limit=10;

}
