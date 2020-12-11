package com.fantasy.study.controller;

import com.fantasy.study.entity.User;
import com.fantasy.study.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

@RestController
/**
* 通过service执行dao操作
 */
public class LoginController {
    @Resource
    private IUserService userService;

//    @RequestMapping(value = "/user/login" ,method = RequestMethod.POST)
//    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password")String password, Map<String,Object> map) {
//        User user = userService.querybyname(username);
//
//        // 返回一个html页面
//        ModelAndView modelAndView = new ModelAndView();
//        if (username.equals(user.getUsername()) && password.equals(user.getUserpwd())) {
//            modelAndView.setViewName("/dashboard.html");
//        } else {
//            modelAndView.setViewName("/404.html");
//        }
//        return modelAndView;
//    }

    @RequestMapping(value = "/user/login" ,method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password")String password, Map<String,Object> map) {
        User user = userService.querybyname(username);
        /**
         * 重定向处理，防止表单重复提交
         */
        if (username.equals(user.getUsername()) && password.equals(user.getUserpwd())) {
            return "redirect:/main.html";
        } else {
            return "redirect:/404.html";
        }
    }
}
