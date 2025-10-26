package com.xzit.user;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/25
 */
public class BeanFactory {
    public static Object getBean(String className){
        ResourceBundle bundle= ResourceBundle.getBundle("bean");
        String userDao=bundle.getString("userDao");
        try {
            Class aClass = Class.forName(userDao);
            return (Object) aClass.getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
