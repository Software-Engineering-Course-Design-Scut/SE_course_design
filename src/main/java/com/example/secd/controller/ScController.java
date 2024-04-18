package com.example.secd.controller;


import com.example.secd.service.IClassroomService;
import com.example.secd.service.IScService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.secd.Result;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.secd.Result;
import javax.annotation.Resource;

/**
 * <p>
 * 选修 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/sc")
public class ScController {
    @Resource
    IScService scService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return scService.point();
    }

    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("id") Integer id
    ){
        return scService.specific(id);
    }
}
