package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import com.example.secd.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 学生 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    IStudentService studentService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return studentService.point();
    }

    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("studentid") Integer id
    ){
        return studentService.specific(id);
    }
}
