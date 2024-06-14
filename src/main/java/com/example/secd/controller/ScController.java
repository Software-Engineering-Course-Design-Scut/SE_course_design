package com.example.secd.controller;


import com.example.secd.entity.Borrow;
import com.example.secd.entity.Sc;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.IScService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;
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
    public Result specific(@RequestParam("studentid") Integer id
    ){
        return scService.specific(id);
    }

    @PostMapping("/add")
    public Result add(@RequestParam("studentid") Integer studentid,
                      @RequestParam(value = "courseid") Integer courseid,
                      @RequestParam(value = "teacherid") Integer teacherid,
                      @RequestParam(value = "grade") Integer grade) {
        Sc sc = new Sc();
        sc.setStudentID(studentid);
        sc.setCourseID(courseid);
        sc.setTeacherID(teacherid);
        sc.setGrade(grade);
        return scService.add(sc);
    }
    @DeleteMapping("/delete")
    public Result delete(@RequestParam("studentid") Integer id) {
        return scService.delete(id);
    }
}
