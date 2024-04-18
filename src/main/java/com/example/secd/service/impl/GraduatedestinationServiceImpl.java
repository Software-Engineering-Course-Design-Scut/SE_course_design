package com.example.secd.service.impl;

import com.example.secd.entity.Graduatedestination;
import com.example.secd.mapper.GraduatedestinationMapper;
import com.example.secd.service.IGraduatedestinationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.example.secd.Result;
/**
 * <p>
 * 毕业去向 服务实现类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Service
public class GraduatedestinationServiceImpl extends ServiceImpl<GraduatedestinationMapper, Graduatedestination> implements IGraduatedestinationService {

    @Override
    public Result point() {
        return null;
    }
}
