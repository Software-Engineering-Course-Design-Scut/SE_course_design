package com.example.secd.service.impl;

import com.example.secd.entity.Student;
import com.example.secd.mapper.StudentMapper;
import com.example.secd.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
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

    @Override
    public Result point() {
        return null;
    }

    @Override
    public Result specific(Integer id) {
        return null;
    }
}
