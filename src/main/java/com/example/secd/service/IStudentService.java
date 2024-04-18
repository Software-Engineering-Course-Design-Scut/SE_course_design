package com.example.secd.service;

import com.example.secd.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 学生 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IStudentService extends IService<Student> {
    Result point();

    Result specific(Integer id);
}
