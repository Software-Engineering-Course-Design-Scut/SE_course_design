package com.example.secd.service.impl;

import com.example.secd.entity.Teacher;
import com.example.secd.mapper.TeacherMapper;
import com.example.secd.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
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

    @Override
    public Result point() {
        return null;
    }

    @Override
    public Result specific(Integer id) {
        return null;
    }
}
