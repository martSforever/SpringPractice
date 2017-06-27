package com.ambzer.spring.injection;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class PropertiesInjectionServiceImpl implements PropertiesInjectionService {

    private InjectionMapper injectionMapper;


    public PropertiesInjectionServiceImpl(InjectionMapper injectionMapper) {
        System.out.println("构造注入！");
        this.injectionMapper = injectionMapper;
    }

    public PropertiesInjectionServiceImpl(){};

    public void doSave(String arg) {
        System.out.println("/*模拟业务操作：service接收参数：*/"+arg);
        arg = arg+":"+this.hashCode();
        injectionMapper.doSave(arg);
    }

    public InjectionMapper getInjectionMapper() {
        return injectionMapper;
    }

    public void setInjectionMapper(InjectionMapper injectionMapper) {
        System.out.println("设值注入！");
        this.injectionMapper = injectionMapper;
    }
}
