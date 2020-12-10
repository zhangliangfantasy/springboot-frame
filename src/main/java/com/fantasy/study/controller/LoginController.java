package com.fantasy.study.controller;

import com.fantasy.study.entity.User;
import com.fantasy.study.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
/**
* 通过service执行dao操作
 */
public class LoginController {
    @Resource
    private IUserService userService;

    @RequestMapping(value = "/user/login" ,method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password")String password, Map<String,Object> map) {
        User user = userService.querybyname(username);

        if (username.equals(user.getUsername()) && password.equals(user.getUserpwd())) {
            return "登录成功";
        } else {
            return "密码都记不到了";
        }
    }
}
