package com.xzit.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/27
 */
//@Component//组件
//@Repository  应用在持久层组件上   TeacherDao
//@Service     应用在业务逻辑组件上  TeacherService
//@Controller   //应用在控制层       TeacherController
@Component
public class Teacher {
    @Value("李老师")
    private String name;
    @Value("50")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
