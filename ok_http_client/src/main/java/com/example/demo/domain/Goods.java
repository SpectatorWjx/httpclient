package com.example.demo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author wjx
 * @Date:2019/1/2
 * @Description:
 */
@Data
public class Goods {
    private int id;

    private String name;

    private Date createTime;
    
}
