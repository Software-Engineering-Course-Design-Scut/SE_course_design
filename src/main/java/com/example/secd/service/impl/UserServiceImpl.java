package com.example.secd.service.impl;

import com.example.secd.entity.User;
import com.example.secd.mapper.UserMapper;
import com.example.secd.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
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

    @Override
    public Result point() {
        return null;
    }

    @Override
    public Result specific(Integer id) {
        return null;
    }
}
