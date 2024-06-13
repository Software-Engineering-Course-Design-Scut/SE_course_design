package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Major;
import com.example.secd.entity.Student;
import com.example.secd.mapper.StudentMapper;
import com.example.secd.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 学生 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Resource
    StudentMapper studentMapper;
    @Override
    public Result point() {

        List<Student> selectList = studentMapper.selectList(null);
        if (selectList != null && !selectList.isEmpty()) {
            return Result.ok(selectList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Student> qw = new QueryWrapper<>();
        qw.eq("StudentID", id);
        List<Student> selectList = studentMapper.selectList(qw);
        if (selectList != null) {
            return Result.ok(selectList);
        } else {
            return Result.fail("该用户未参与任何课程");
        }
    }
}
