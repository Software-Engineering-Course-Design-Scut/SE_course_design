package com.example.secd.service.impl;

import com.example.secd.entity.Borrow;
import com.example.secd.entity.Course;
import com.example.secd.entity.Graduatedestination;
import com.example.secd.mapper.GraduatedestinationMapper;
import com.example.secd.service.IGraduatedestinationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 毕业去向 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class GraduatedestinationServiceImpl extends ServiceImpl<GraduatedestinationMapper, Graduatedestination> implements IGraduatedestinationService {
    @Resource
    GraduatedestinationMapper graduatedestinationMapper;
    @Override
    public Result point() {
        List<Graduatedestination> graduatedestinationList = graduatedestinationMapper.selectList(null);
        if (graduatedestinationList != null && !graduatedestinationList.isEmpty()) {
            return Result.ok(graduatedestinationList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Graduatedestination graduatedestination) {
        int result = graduatedestinationMapper.insert(graduatedestination);
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
