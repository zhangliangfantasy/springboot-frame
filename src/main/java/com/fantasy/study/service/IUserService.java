package com.fantasy.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fantasy.study.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> querAll();

    User querybyname(String username);

    Boolean add(User user);

    Boolean update(User user);

    boolean delete(int id);
}
