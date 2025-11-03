package com.xzit.service;

import com.xzit.entity.Student;
import com.xzit.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper mapper;
    @Override
    public void save(Student student) {
        mapper.save(student);
    }

    @Override
    public List<Student> selectList() {
        return mapper.selectList();
    }
}
