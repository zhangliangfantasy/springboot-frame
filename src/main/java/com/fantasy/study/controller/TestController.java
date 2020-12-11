package com.fantasy.study.controller;

import com.fantasy.study.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试日志
 * 可以在配置文件中修改日志级别
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/test")
    public void test() {
        logger.trace("trace日志。。。。。。。。。。。。");
        logger.debug("debug日志。。。。。。。。。。。。");
        logger.info("info日志。。。。。。。。。。。。。");
        logger.warn("warn日志。。。。。。。。。。。。。");
        logger.error("错误日志。。。。。。。。。。。。。");
    }

//    @GetMapping("/redis/test")
//    public String redisTest() {
//        redisUtil.set("fantasy", "zhangliang");
//        if (!redisUtil.hasKey("fantasy")) {
//            return "有值";
//        } else {
//            return "没有值";
//        }
//    }
}
