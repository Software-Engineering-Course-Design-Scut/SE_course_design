package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import com.example.secd.service.IMajorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 专业 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/major")
public class MajorController {
    @Resource
    IMajorService majorService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return majorService.point();
    }
}
