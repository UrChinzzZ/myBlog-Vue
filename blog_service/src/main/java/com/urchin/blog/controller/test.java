package com.urchin.blog.controller;

import java.util.*;

/**
 * @author urchin
 * @Description
 * @PROJECT_NAME blog_service
 * @create 2020-06-18 23:12
 */
public class test {

    public static void main(String[] args) {

    }
    public static Map  testMapList(String s){
        /** 
        * @Description: 测试
        * @Param: [s] 
        * @return: java.util.Map 
        * @Author: Mr.urchin
        * @Date: 11:09 
        */
        Map<java.lang.constant.Constable, String> testMap=new HashMap<java.lang.constant.Constable, String>();
        testMap.put("用地规模","472076.08");
        testMap.put("规划","0");
        testMap.put("个数","8");
        List<Map<java.lang.constant.Constable, String>> testList=new ArrayList<>();
        testList.add(testMap);
        Map<Object, Object> testMap2=new HashMap<>();
        testMap2.put("NAME","未央区111");
        testMap2.put("aaaa",testList);
        System.out.println(testMap2);
        for (int i=0;i<testList.size();i++){
            Map<java.lang.constant.Constable, String> testMapKey=new HashMap<>();
            testMapKey= testList.get(i);
            for(Object key : testMapKey.keySet()){
           String value = testMapKey.get( key);
                testMap2.put(key,value);
            }
        }
        testMap2.remove("aaaa");
        System.out.println(testMap2);
        return  testMap2;
    }
}