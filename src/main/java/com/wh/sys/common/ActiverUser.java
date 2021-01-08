package com.wh.sys.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.wh.sys.entity.User;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiverUser {

    private User user;

    private List<String> roles;

    private List<String> permission;

}
