package com.xzit.test;

import com.xzit.entity.Student;
import com.xzit.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.DomainCombiner;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        /*Student student=new Student();
        student.setName("王某").setAge(23).setGender("男");*/

        StudentService service=context.getBean(StudentService.class);
        /*service.save(student);*/
        List<Student> list=service.selectList();
        list.forEach(System.out::println);
    }
}
