package com.example.secd.service.impl;

import com.example.secd.entity.Course;
import com.example.secd.mapper.CourseMapper;
import com.example.secd.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
/**
 * <p>
 * 课程 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Override
    public Result point() {
        return null;
    }
}
