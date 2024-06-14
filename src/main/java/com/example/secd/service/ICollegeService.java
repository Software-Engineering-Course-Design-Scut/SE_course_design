package com.example.secd.service;

import com.example.secd.entity.College;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 学院 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface ICollegeService extends IService<College> {
    Result point();

    Result add(College college);

    Result delete(Integer id);
}
