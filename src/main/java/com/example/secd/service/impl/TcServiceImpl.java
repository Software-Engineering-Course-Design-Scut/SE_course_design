package com.example.secd.service.impl;

import com.example.secd.entity.Tc;
import com.example.secd.mapper.TcMapper;
import com.example.secd.service.ITcService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
/**
 * <p>
 * 任教 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class TcServiceImpl extends ServiceImpl<TcMapper, Tc> implements ITcService {

    @Override
    public Result point() {
        return null;
    }

    @Override
    public Result specific(Integer id) {
        return null;
    }
}
