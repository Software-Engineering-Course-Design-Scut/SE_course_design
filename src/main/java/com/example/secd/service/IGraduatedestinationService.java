package com.example.secd.service;

import com.example.secd.entity.Graduatedestination;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 毕业去向 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IGraduatedestinationService extends IService<Graduatedestination> {
    Result point();

    Result add(Graduatedestination graduatedestination);

    Result delete(Integer id);
}
