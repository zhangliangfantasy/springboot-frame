package com.fantasy.springbootframework.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fantasy.springbootframework.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> queryAlluser();

    User queryuserbyname(String name);

    User queryuserbyid(int id);

    boolean AddUser(User user);

    boolean DelUser(int id);

    boolean UpdUser(User user);
}
