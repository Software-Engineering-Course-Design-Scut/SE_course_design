package com.example.secd.controller;


import com.example.secd.entity.Book;
import com.example.secd.entity.Classroom;
import com.example.secd.service.IClassroomService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;

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
    @PostMapping("/add")
    public Result add(@RequestParam("classroomid") Integer classroomid,
                      @RequestParam(value = "classroomname") String classroomname) {
        Classroom classroom = new Classroom();
        classroom.setClassroomID(classroomid);
        classroom.setClassroomName(classroomname);
        return classroomService.add(classroom);
    }
    @DeleteMapping("/delete")
    public Result delete(@RequestParam("classroomid") Integer id) {
        return classroomService.delete(id);
    }
}
