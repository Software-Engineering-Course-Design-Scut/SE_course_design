package com.example.secd.controller;


import com.example.secd.service.IClassService;
import com.example.secd.service.IClassroomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 * 班级 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/class")
public class ClassController {
    @Resource
    IClassService classService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return classService.point();
    }
}
