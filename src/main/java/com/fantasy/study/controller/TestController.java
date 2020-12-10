package com.fantasy.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试日志
 * 可以在配置文件中修改日志级别
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/test")
    public void test() {
        logger.trace("trace日志。。。。。。。。。。。。");
        logger.debug("debug日志。。。。。。。。。。。。");
        logger.info("info日志。。。。。。。。。。。。。");
        logger.warn("warn日志。。。。。。。。。。。。。");
        logger.error("错误日志。。。。。。。。。。。。。");
        String a = null;
        logger.error(a);
    }
}
