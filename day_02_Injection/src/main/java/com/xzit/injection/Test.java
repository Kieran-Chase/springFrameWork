package com.xzit.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/26
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        TeacherService service=context.getBean("teacherService1",TeacherService.class);
        System.out.println(service);
        /*String[] addrs=service.getAddrs();
        for (String addr : addrs) {
            System.out.println("addr = " + addr);
        }*/
        /*Set<String> set=service.getSet();
        set.forEach(s-> {
            System.out.println(s);
        });*/
        /*Set<Teacher> teachers=service.getTeachers();
        teachers.forEach(System.out::println);*/
        /*List<String> list=service.getList();
        System.out.println(list);*/
        /*Map<String,Double> map=service.getMap();
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+"\t" + map.get(key));
        }*/
       /* Properties properties=service.getProperties();
        String aaa=properties.getProperty("aaa");
        System.out.println(aaa);*/
        TeacherDao dao=service.getDao();
        System.out.println(dao);
    }
}
