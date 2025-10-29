package com.xzit.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
@Data
public class Person {
    private String name;
    private int age;
    private LocalDate birthday;
}
