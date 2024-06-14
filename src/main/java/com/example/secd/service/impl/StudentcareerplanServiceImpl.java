package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Borrow;
import com.example.secd.entity.Studentcareerplan;
import com.example.secd.mapper.ScMapper;
import com.example.secd.mapper.StudentcareerplanMapper;
import com.example.secd.service.IStudentcareerplanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 学生发展规划 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class StudentcareerplanServiceImpl extends ServiceImpl<StudentcareerplanMapper, Studentcareerplan> implements IStudentcareerplanService {

    @Resource
    StudentcareerplanMapper studentcareerplanMapper;
    @Override
    public Result point() {

        List<Studentcareerplan> studentcareerplanList = studentcareerplanMapper.selectList(null);
        if (studentcareerplanList != null && !studentcareerplanList.isEmpty()) {
            return Result.ok(studentcareerplanList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Studentcareerplan> qw = new QueryWrapper<>();
        qw.eq("StudentID", id);
        List<Studentcareerplan> studentcareerplanList = studentcareerplanMapper.selectList(qw);
        if (studentcareerplanList != null && !studentcareerplanList.isEmpty()) {
            return Result.ok(studentcareerplanList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Studentcareerplan studentcareerplan) {
        int result = studentcareerplanMapper.insert(studentcareerplan);
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
