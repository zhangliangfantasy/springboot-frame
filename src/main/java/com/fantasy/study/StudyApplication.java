package com.fantasy.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @MapperScan(...) 这里配置了，在别的Maper接口里面不用再配置@Mapper
 * @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) 排除自动注入数据源的配置（取消数据库配置）
 */
@MapperScan(basePackages = {"com.fantasy.study.**.mapper*"})
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}
