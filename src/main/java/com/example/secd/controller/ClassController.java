package com.example.secd.controller;


import com.example.secd.entity.Book;
import com.example.secd.entity.Class;
import com.example.secd.service.IClassService;
import com.example.secd.service.IClassroomService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;

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
    @PostMapping("/add")
    public Result add(@RequestParam("classid") Integer classid,
                      @RequestParam(value = "classname") String classname,
                      @RequestParam(value = "majorid") Integer majorid) {
        Class aclass = new Class();
        aclass.setClassID(classid);
        aclass.setClassName(classname);
        aclass.setMajorID(majorid);
        return classService.add(aclass);
    }
}
