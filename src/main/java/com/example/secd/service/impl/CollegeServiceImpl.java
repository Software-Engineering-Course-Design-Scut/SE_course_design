package com.example.secd.service.impl;

import com.example.secd.entity.Borrow;
import com.example.secd.entity.Class;
import com.example.secd.entity.College;
import com.example.secd.mapper.CollegeMapper;
import com.example.secd.service.ICollegeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 学院 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class CollegeServiceImpl extends ServiceImpl<CollegeMapper, College> implements ICollegeService {
    @Resource
    CollegeMapper collegeMapper;
    @Override
    public Result point() {

        List<College> collegeList = collegeMapper.selectList(null);
        if (collegeList != null && !collegeList.isEmpty()) {
            return Result.ok(collegeList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(College college) {
        int result = collegeMapper.insert(college);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }
}
