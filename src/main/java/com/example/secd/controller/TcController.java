package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import com.example.secd.service.ITcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 任教 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/tc")
public class TcController {
    @Resource
    ITcService tcService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return tcService.point();
    }
    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("id") Integer id
    ){
        return tcService.specific(id);
    }
}
