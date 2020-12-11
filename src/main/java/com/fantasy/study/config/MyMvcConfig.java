package com.fantasy.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 使用WebMvcConfigurerAdapter可以来扩展SpringMvc的功能
 * 这个配置类暂时用不上
 * @EnableWebMvc全面接管mvc配置，springboot mvc自动配置将失效
 */
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter  {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
    }

    // 所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/main.html").setViewName("dashboard");
                registry.addViewController("/404.html").setViewName("404");
            }
        };
        return adapter;
    }
}
