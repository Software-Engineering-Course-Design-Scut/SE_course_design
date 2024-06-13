package com.example.secd.service;

import com.example.secd.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface ICourseService extends IService<Course> {
    Result point();

    Result add(Course course);
}
