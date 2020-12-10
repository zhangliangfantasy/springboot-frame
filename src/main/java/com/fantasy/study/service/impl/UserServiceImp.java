package com.fantasy.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fantasy.study.entity.User;
import com.fantasy.study.mapper.UserMapper;
import com.fantasy.study.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp extends ServiceImpl<UserMapper,User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> querAll() {
        return this.userMapper.queryAlluser();
    }

    @Override
    public User querybyname(String username) {
        return this.userMapper.queryuserbyname(username);
    }

    @Override
    public Boolean add(User user) {
        return this.userMapper.AddUser(user);
    }

    @Override
    public Boolean update(User user) {
        return  this.userMapper.UpdUser(user);
    }

    @Override
    public boolean delete(int id) {
        return this.userMapper.DelUser(id);
    }
}
