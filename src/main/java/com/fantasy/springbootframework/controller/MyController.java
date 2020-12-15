package com.fantasy.springbootframework.controller;

import com.fantasy.springbootframework.entity.User;
import com.fantasy.springbootframework.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangliang
 */
@RestController
@RequestMapping("/user")
public class MyController {

    @Resource
    private IUserService userService;

    /**
     * 查询所有用户
     * @return List<User>
     */
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<User> queryAllUser() {
        return this.userService.queryAll();
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return String
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(@RequestParam("username") String username, @RequestParam("password")String password) {
        User user = userService.queryByName(username);

        if (username.equals(user.getUsername()) && password.equals(user.getUserpwd())) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }

    /**
     * 新增
     * @param user
     * @return String
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(User user) {
        boolean b = userService.addUser(user);

        if (b) {
            return "新增成功";
        } else {
            return "新增失败";
        }
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public String deleteUser(@RequestParam("id") int id) {
        System.out.println(id);
        boolean b = userService.deleteUser(id);

        if (b) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }



}
