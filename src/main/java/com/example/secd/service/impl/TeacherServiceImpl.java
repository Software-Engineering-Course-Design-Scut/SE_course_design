package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Borrow;
import com.example.secd.entity.Teacher;
import com.example.secd.mapper.TeacherMapper;
import com.example.secd.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 教师 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Resource
    TeacherMapper teacherMapper;
    @Override
    public Result point() {

        List<Teacher> teacherList = teacherMapper.selectList(null);
        if (teacherList != null && !teacherList.isEmpty()) {
            return Result.ok(teacherList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Teacher> qw = new QueryWrapper<>();
        qw.eq("TeacherID", id);
        List<Teacher> teacherList = teacherMapper.selectList(qw);
        if (teacherList != null && !teacherList.isEmpty()) {
            return Result.ok(teacherList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Teacher teacher) {
        int result = teacherMapper.insert(teacher);
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
