package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 教室 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    @Resource
    IClassroomService classroomService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return classroomService.point();
    }
}
