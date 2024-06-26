package com.example.secd.service;

import com.example.secd.entity.Classroom;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 教室 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IClassroomService extends IService<Classroom> {

    Result point();


    Result add(Classroom classroom);

    Result delete(Integer id);
}
