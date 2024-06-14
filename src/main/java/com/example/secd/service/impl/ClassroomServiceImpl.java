package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.entity.Borrow;
import com.example.secd.entity.Classroom;
import com.example.secd.mapper.ClassroomMapper;
import com.example.secd.service.IClassroomService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 教室 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */

@Service
public class ClassroomServiceImpl extends ServiceImpl<ClassroomMapper, Classroom> implements IClassroomService {

    @Resource
    ClassroomMapper classroomMapper;
    @Override
    public Result point() {

        List<Classroom> classroomList = classroomMapper.selectList(null);
        if (classroomList != null && !classroomList.isEmpty()) {
            return Result.ok(classroomList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }

    }

    @Override
    public Result add(Classroom classroom) {
        int result = classroomMapper.insert(classroom);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }


    public Result delete(Integer id) {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("ClassroomID", id);
        int result=classroomMapper.deleteByMap(columnMap);
        if (result > 0) {
            return Result.ok("书籍删除成功");
        } else {
            return Result.fail("书籍删除失败");
        }
    }
}
