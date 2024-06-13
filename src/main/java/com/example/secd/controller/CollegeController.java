package com.example.secd.controller;


import com.example.secd.entity.Classroom;
import com.example.secd.entity.College;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.ICollegeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public Result add(@RequestParam("collegeid") Integer collegeid,
                      @RequestParam(value = "collegename") String collegename) {
        College college = new College();
        college.setCollegeID(collegeid);
        college.setCollegeName(collegename);
        return collegeService.add(college);
    }
}
