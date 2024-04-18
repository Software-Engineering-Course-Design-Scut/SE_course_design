package com.example.secd.service.impl;

import com.example.secd.entity.Sc;
import com.example.secd.mapper.ScMapper;
import com.example.secd.service.IScService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
/**
 * <p>
 * 选修 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class ScServiceImpl extends ServiceImpl<ScMapper, Sc> implements IScService {

    @Override
    public Result point() {
        return null;
    }

    @Override
    public Result specific(Integer id) {
        return null;
    }
}
