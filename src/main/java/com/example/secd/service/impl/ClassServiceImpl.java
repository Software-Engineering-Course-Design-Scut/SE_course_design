package com.example.secd.service.impl;

import com.example.secd.entity.Borrow;
import com.example.secd.entity.Class;
import com.example.secd.entity.Classroom;
import com.example.secd.mapper.ClassMapper;
import com.example.secd.mapper.ClassroomMapper;
import com.example.secd.service.IClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 班级 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements IClassService {

    @Resource
    ClassMapper classMapper;
    @Override
    public Result point() {

        List<Class> classList = classMapper.selectList(null);
        if (classList != null && !classList.isEmpty()) {
            return Result.ok(classList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }

    }

    @Override
    public Result add(Class aclass) {
        int result = classMapper.insert(aclass);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }
}
