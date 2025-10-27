package com.xzit.auto;

import jdk.jfr.DataAmount;
import lombok.Data;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/27
 */
@Data
public class Student {
    private String name;
    private Teacher teacher;
    private School school;
}
