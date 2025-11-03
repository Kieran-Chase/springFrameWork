package com.xzit.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/2
 */
@Data
@Accessors(chain=true)
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
}
