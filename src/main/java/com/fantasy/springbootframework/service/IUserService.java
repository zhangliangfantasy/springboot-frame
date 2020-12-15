package com.fantasy.springbootframework.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fantasy.springbootframework.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> queryAll();

    boolean addUser(User user);

    boolean deleteUser(int id);

    boolean update(User user);

    User queryById(int id);

    User queryByName(String name);
}
