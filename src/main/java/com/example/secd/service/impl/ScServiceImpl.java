package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Borrow;
import com.example.secd.entity.Sc;
import com.example.secd.entity.Student;
import com.example.secd.mapper.ScMapper;
import com.example.secd.mapper.StudentMapper;
import com.example.secd.service.IScService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 选修 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class ScServiceImpl extends ServiceImpl<ScMapper, Sc> implements IScService {

    @Resource
    ScMapper scMapper;
    @Override
    public Result point() {

        List<Sc> scList = scMapper.selectList(null);
        if (scList != null && !scList.isEmpty()) {
            return Result.ok(scList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Sc> qw = new QueryWrapper<>();
        qw.eq("StudentID", id);
        List<Sc> scList = scMapper.selectList(qw);
        if (scList != null && !scList.isEmpty()) {
            return Result.ok(scList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Sc sc) {
        int result = scMapper.insert(sc);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }
}
