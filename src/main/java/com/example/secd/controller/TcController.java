package com.example.secd.controller;


import com.example.secd.entity.Borrow;
import com.example.secd.entity.Tc;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.ITcService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;

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
    public Result specific(@RequestParam("teacherid") Integer id
    ){
        return tcService.specific(id);
    }
    @PostMapping("/add")
    public Result add(@RequestParam("teacherid") Integer teacherid,
                      @RequestParam(value = "courseid") Integer courseid,
                      @RequestParam(value = "classtime") String classtime,
                      @RequestParam(value = "classroomid") Integer classroomid) {
        Tc tc = new Tc();
        tc.setTeacherID(teacherid);
        tc.setCourseID(courseid);
        tc.setClassTime(classtime);
        tc.setClassroomID(classroomid);
        return tcService.add(tc);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam("teacherid") Integer id) {
        return tcService.delete(id);
    }
}
