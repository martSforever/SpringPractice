package com.ambzer.spring.injection;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class InjectionMapperImpl implements InjectionMapper{

    public void doSave(String arg) {
        System.out.println("/*模拟数据库保存数据操作*/save data:"+arg);
    }
}
