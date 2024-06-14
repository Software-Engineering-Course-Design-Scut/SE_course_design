package com.example.secd.service;

import com.example.secd.entity.Studentcareerplan;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 学生发展规划 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IStudentcareerplanService extends IService<Studentcareerplan> {
    Result point();

    Result specific(Integer id);

    Result add(Studentcareerplan studentcareerplan);

    Result delete(Integer id);
}
