package com.wh.bus.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import com.wh.bus.entity.Outport;

import java.util.Date;


@Data
@EqualsAndHashCode(callSuper = false)
public class OutportVo extends Outport {

    private Integer page = 1;

    private Integer limit = 10;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;


}
