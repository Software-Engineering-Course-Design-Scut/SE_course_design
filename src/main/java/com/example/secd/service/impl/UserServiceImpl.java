package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Borrow;
import com.example.secd.entity.User;
import com.example.secd.mapper.UserMapper;
import com.example.secd.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;
    @Override
    public Result point() {

        List<User> userList = userMapper.selectList(null);
        if (userList != null && !userList.isEmpty()) {
            return Result.ok(userList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("UserID", id);
        List<User> userList = userMapper.selectList(qw);
        if (userList != null && !userList.isEmpty()) {
            return Result.ok(userList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(User user) {
        int result = userMapper.insert(user);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
