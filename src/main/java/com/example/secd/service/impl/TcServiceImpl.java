package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Borrow;
import com.example.secd.entity.Tc;
import com.example.secd.mapper.TcMapper;
import com.example.secd.service.ITcService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 任教 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class TcServiceImpl extends ServiceImpl<TcMapper, Tc> implements ITcService {

    @Resource
    TcMapper tcMapper;
    @Override
    public Result point() {

        List<Tc> tcList = tcMapper.selectList(null);
        if (tcList != null && !tcList.isEmpty()) {
            return Result.ok(tcList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Tc> qw = new QueryWrapper<>();
        qw.eq("TeacherID", id);
        List<Tc> tcList = tcMapper.selectList(qw);
        if (tcList != null && !tcList.isEmpty()) {
            return Result.ok(tcList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Tc tc) {
        int result = tcMapper.insert(tc);
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
