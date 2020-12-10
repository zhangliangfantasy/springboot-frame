package com.fantasy.study.controller;

import com.fantasy.study.entity.User;
import com.fantasy.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/user")
/**
 * 直接控制器执行dao操作
 */
public class MyController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping(value = {"/queryAlluser"}, method = RequestMethod.GET)
    public List<User> queryalluser() {
        List<User> list = userMapper.queryAlluser();
        return list;
    }

    @RequestMapping(value = {"/queryuserbyid"}, method = RequestMethod.GET)
    public User queryuserbyid(String userid) {
        User user = userMapper.queryuserbyid(Integer.parseInt(userid));
        return user;
    }

    @RequestMapping(value = {"/adduser"} , method = RequestMethod.GET)
    /**
     * 返回一个html界面，申明ModelAndView
     * 语法：
     *  ModelAndView modelAndView = new ModelAndView();
     *  modelAndView.setViewName("/index.html");
     */
    public ModelAndView adduser(User user){
        boolean flag = userMapper.AddUser((User) user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.html");
        if (flag) {
            return modelAndView;
        } else {
            return null;
        }
//        return flag ?"success":"fail";
    }

    @RequestMapping(value = {"/Upuserbyid"} , method = RequestMethod.GET)
    public String Upuser(User user){
        boolean flag = userMapper.UpdUser((User) user);
        return flag?"success":"fail";
    }

    @RequestMapping(value = {"/Deluserbyid"} , method = RequestMethod.GET)
    public String Deluserbyid(String userid){
        boolean flag  =  userMapper.DelUser(Integer.parseInt(userid));
        return flag?"success":"fail";
    }
}
