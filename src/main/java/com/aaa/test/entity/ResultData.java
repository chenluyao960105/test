package com.aaa.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author ：陈路遥
 * @date ：Created in 2020/6/19 13:29
 * @description：layui返回实体
 * @modified By：
 * @version: 1.0
 */
@Data
@AllArgsConstructor
public class ResultData {
    private Integer code;
    private String msg;
    private Integer count;
    private List data;
}
