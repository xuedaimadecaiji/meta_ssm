package com.zeng.ssm.common;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

// 不加component，得不到上下文信息
@Component
public class ModelHandler implements ApplicationContextAware {

    /**
     * 上下文对象实例
     */
    private static ApplicationContext applicationContext;
    private static StringBuilder stringBuilder = new StringBuilder();

    public static Model makeModel(String tableName, String json) {
        String className = getModelName(tableName);
        try {
            Class<Model> c1 = (Class<Model>) Class.forName(className);
            return JSON.parseObject(json, c1.getDeclaredConstructor().newInstance().getClass());
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getModelName(String tableName) {
        stringBuilder.setLength(0);
        for(String str : tableName.split("_")) {
            stringBuilder.append(str.substring(0,1).toUpperCase().concat(str.substring(1)));
        }
        String root = "com.zeng.ssm.model.";
        return root + stringBuilder.toString();
    }

    static ModelDao getModelDao(String tableName) {
        String daoName = getDaoName(tableName);
        Class cl = null;
        try {
            cl = Class.forName(daoName);
            return getBean(cl);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getDaoName(String tableName) {
        stringBuilder.setLength(0);
        for(String str : tableName.split("_")) {
            stringBuilder.append(str.substring(0,1).toUpperCase().concat(str.substring(1)));
        }
        String root = "com.zeng.ssm.dao.";
        return root + stringBuilder.toString() + "Dao";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ModelHandler.applicationContext = applicationContext;
    }

    /**
     * 通过class获取Bean.
     */
    private static ModelDao getBean(Class<ModelDao> clazz) {
//        for(String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
        return applicationContext.getBean(clazz);
    }
}
