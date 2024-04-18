package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import com.example.secd.service.ICollegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 学院 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/college")
public class CollegeController {
    @Resource
    ICollegeService collegeService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return collegeService.point();
    }
}
