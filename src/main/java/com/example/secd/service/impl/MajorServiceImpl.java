package com.example.secd.service.impl;

import com.example.secd.entity.Borrow;
import com.example.secd.entity.Graduatedestination;
import com.example.secd.entity.Major;
import com.example.secd.mapper.MajorMapper;
import com.example.secd.service.IMajorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 专业 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements IMajorService {

    @Resource
    MajorMapper majorMapper;
    @Override
    public Result point() {

        List<Major> majorList = majorMapper.selectList(null);
        if (majorList != null && !majorList.isEmpty()) {
            return Result.ok(majorList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Major major) {
        int result = majorMapper.insert(major);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }
}
