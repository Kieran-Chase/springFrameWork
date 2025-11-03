package com.xzit.mapper;

import com.xzit.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
@Repository
public interface StudentMapper {
    void save(Student student);
    List<Student> selectList();
}
