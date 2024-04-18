package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import com.example.secd.service.ITeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 教师 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    ITeacherService teacherService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return teacherService.point();
    }
    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("id") Integer id
    ){
        return teacherService.specific(id);
    }
}
