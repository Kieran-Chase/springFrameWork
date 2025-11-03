package com.xzit.service;

import com.xzit.entity.Student;

import java.util.List;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
public interface StudentService {
    void save(Student student);
    List<Student> selectList();
}
