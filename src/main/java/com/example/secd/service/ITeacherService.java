package com.example.secd.service;

import com.example.secd.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 教师 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
public interface ITeacherService extends IService<Teacher> {
    Result point();

    Result specific(Integer id);

    Result add(Teacher teacher);
}
