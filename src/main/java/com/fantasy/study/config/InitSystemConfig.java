package com.fantasy.study.config;

import com.fantasy.study.service.impl.InitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Order(value = 0)
public class InitSystemConfig implements CommandLineRunner, EnvironmentAware {
    @Resource
    InitServiceImpl initServiceImpl;
    /*
     * 在服务启动后执行，会在@Bean实例化之后执行，故如果@Bean需要依赖这里的话会出问题
     */
    @Override
    public void run(String... args) {
        try {
            initServiceImpl.InitSystemTables();
            System.out.println("系统初始化成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("系统初始化失败");
        }
    }

    /*
     * 在SystemConfigDao实例化之后、@Bean实例化之前执行 常用于读取数据库配置以供其它bean使用
     * environment对象可以获取配置文件的配置，也可以把配置设置到该对象中
     */
    @Override
    public void setEnvironment(Environment environment) {

    }
}
