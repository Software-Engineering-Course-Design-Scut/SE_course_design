package com.example.secd.service.impl;

import com.example.secd.entity.College;
import com.example.secd.mapper.CollegeMapper;
import com.example.secd.service.ICollegeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
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

    @Override
    public Result point() {
        return null;
    }
}
