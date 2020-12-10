package com.fantasy.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fantasy.study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {

    List<User> queryAlluser();

    User queryuserbyid(int userid);

    boolean AddUser(User user);

    boolean DelUser(int id);

    boolean UpdUser(User user);

    User queryuserbyname(String name);
}
