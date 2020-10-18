package com.lzy.dao;

import com.lzy.pojo.User;

import java.util.List;

public interface UserDao {
    List<User>getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
