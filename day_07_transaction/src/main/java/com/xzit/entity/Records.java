package com.xzit.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
@Data
@Accessors(chain=true)
public class Records {
    private int id;
    private String accno;
    private String category;
    private int money;
}
