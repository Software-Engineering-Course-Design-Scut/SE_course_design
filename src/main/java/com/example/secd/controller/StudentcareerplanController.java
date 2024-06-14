package com.example.secd.controller;


import com.example.secd.entity.Borrow;
import com.example.secd.entity.Studentcareerplan;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.IStudentcareerplanService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 学生发展规划 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/studentcareerplan")
public class StudentcareerplanController {
    @Resource
    IStudentcareerplanService studentcareerplanService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return studentcareerplanService.point();
    }

    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("studentid") Integer id
    ){
        return studentcareerplanService.specific(id);
    }
    @PostMapping("/add")
    public Result add(@RequestParam("studentcareerplanid") Integer studentcareerplanid,
                      @RequestParam(value = "studentid") Integer studentid,
                      @RequestParam(value = "careerplanadvice") String careerplanadvice) {
        Studentcareerplan studentcareerplan = new Studentcareerplan();
        studentcareerplan.setStudentCareerPlanID(studentcareerplanid);
        studentcareerplan.setStudentID(studentid);
        studentcareerplan.setCareerPlanAdvice(careerplanadvice);
        return studentcareerplanService.add(studentcareerplan);
    }
    @DeleteMapping("/delete")
    public Result delete(@RequestParam("studentid") Integer id) {
        return studentcareerplanService.delete(id);
    }
}
