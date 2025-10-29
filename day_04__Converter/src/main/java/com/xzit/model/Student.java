package com.xzit.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
@Data
public class Student {
    private String name;
    private LocalDate birth;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birth=" + birth.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日")) +
                '}';
    }
}
