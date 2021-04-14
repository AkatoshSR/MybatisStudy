package com.sqx.Dao;

import com.sqx.Pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 获得用户列表
    List<User> getUserList();

    // 根据id查询用户信息
    User getUserById(int id);

    // 插入用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);

    //分页
    List<User> getUserByLimit(Map<String, Integer> map);

}
