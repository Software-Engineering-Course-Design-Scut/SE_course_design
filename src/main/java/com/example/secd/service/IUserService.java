package com.example.secd.service;

import com.example.secd.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
public interface IUserService extends IService<User> {
    Result point();

    Result specific(Integer id);
}
