package com.fantasy.springbootframework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fantasy.springbootframework.entity.User;
import com.fantasy.springbootframework.mapper.UserMapper;
import com.fantasy.springbootframework.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryAll() {
        return this.userMapper.queryAlluser();
    }

    @Override
    public boolean addUser(User user) {
        return this.userMapper.AddUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return this.userMapper.DelUser(id);
    }

    @Override
    public boolean update(User user) {
        return this.userMapper.UpdUser(user);
    }

    @Override
    public User queryById(int id) {
        return this.userMapper.queryuserbyid(id);
    }

    @Override
    public User queryByName(String name) {
        return this.userMapper.queryuserbyname(name);
    }
}
