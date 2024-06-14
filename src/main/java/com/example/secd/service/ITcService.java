package com.example.secd.service;

import com.example.secd.entity.Tc;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 任教 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface ITcService extends IService<Tc> {
    Result point();

    Result specific(Integer id);

    Result add(Tc tc);

    Result delete(Integer id);
}
