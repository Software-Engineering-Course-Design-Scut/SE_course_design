package com.example.secd.service;

import com.example.secd.entity.Class;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 班级 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IClassService extends IService<Class> {
    Result point();

    Result add(Class aclass);

    Result delete(Integer id);
}
