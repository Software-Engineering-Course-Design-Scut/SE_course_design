package com.example.secd.service.impl;

import com.example.secd.entity.Borrow;
import com.example.secd.entity.College;
import com.example.secd.entity.Course;
import com.example.secd.mapper.CourseMapper;
import com.example.secd.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    CourseMapper courseMapper;
    @Override
    public Result point() {

        List<Course> courseList = courseMapper.selectList(null);
        if (courseList != null && !courseList.isEmpty()) {
            return Result.ok(courseList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }
    @Override
    public Result add(Course course) {
        int result = courseMapper.insert(course);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
