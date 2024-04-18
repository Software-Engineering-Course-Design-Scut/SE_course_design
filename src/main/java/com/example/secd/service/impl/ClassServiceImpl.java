package com.example.secd.service.impl;

import com.example.secd.entity.Class;
import com.example.secd.mapper.ClassMapper;
import com.example.secd.service.IClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
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

    @Override
    public Result point() {
        return null;
    }
}
