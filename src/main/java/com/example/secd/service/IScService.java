package com.example.secd.service;

import com.example.secd.entity.Sc;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 选修 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IScService extends IService<Sc> {
    Result point();

    Result specific(Integer id);

    Result add(Sc sc);

    Result delete(Integer id);
}
