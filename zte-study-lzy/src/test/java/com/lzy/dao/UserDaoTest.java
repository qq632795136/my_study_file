package com.lzy.dao;

import com.lzy.pojo.User;
import com.lzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    // 获取所有用户
    @Test
    public void test() {
        // 获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    // 根据id获取用户数据
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(2);
        System.out.println(user);

        sqlSession.close();
    }

    //增加用户，注意数据库的增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.addUser(new User(3,"zlt","123456"));
        if (res > 0) {
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //修改用户信息
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.updateUser(new User(3,"mmm","123456"));
        System.out.println(res);
        if (res > 0) {

            System.out.println("修改成功");
        }
        else {
            System.out.println("删除失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void daleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.deleteUser(3);
        if (res > 0) {
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
