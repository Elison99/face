package com.xiaoyou.face.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 注册
 * @date 2021/12/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterInfo {
    private int id;
    private String stuId;
    private String name;
}
