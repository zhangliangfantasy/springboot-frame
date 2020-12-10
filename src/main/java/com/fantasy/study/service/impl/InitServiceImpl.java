package com.fantasy.study.service.impl;

import com.fantasy.study.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class InitServiceImpl {

    @Autowired
    private RedisUtil redisUtil;

    /**
     * @Description 初始化系统表
     * @author lannis
     * @date 2019年8月23日 下午3:08:47
     */
    public void InitSystemTables() throws Exception {
        long start_time = Calendar.getInstance().getTimeInMillis();
        System.out.println("开始");
        if (!redisUtil.hasKey("Lannis")) {
            System.out.println("没有缓存，开始缓存。。。");
            long start_time_isnert = Calendar.getInstance().getTimeInMillis();
            redisUtil.set("Lannis", "初始化的缓存");
            System.out.println("缓存完成，耗时：" + (Calendar.getInstance().getTimeInMillis() - start_time_isnert));
        } else {
            System.out.println("更新中");
            long start_time_update = Calendar.getInstance().getTimeInMillis();
            redisUtil.set("Lannis", "更新的缓存");
            System.out.println("更新完成，耗时:" + (Calendar.getInstance().getTimeInMillis() - start_time_update));
        }
        System.out.println("内容:"+redisUtil.get("Lannis"));
        System.out.println("结束,总共耗时：" + (Calendar.getInstance().getTimeInMillis() - start_time));
    }

}
