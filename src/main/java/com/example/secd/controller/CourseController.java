package com.example.secd.controller;


import com.example.secd.entity.Borrow;
import com.example.secd.entity.Course;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.ICourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    ICourseService courseService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return courseService.point();
    }
    @PostMapping("/add")
    public Result add(@RequestParam("courseid") Integer courseid,
                      @RequestParam(value = "coursename") String coursename,
                      @RequestParam(value = "coursetype") String coursetype,
                      @RequestParam(value = "asseessmentmethod") String asseessmentmethod,
                      @RequestParam(value = "weeklyhours") Integer weeklyhours,
                      @RequestParam(value = "theoreticalhours") Integer theoreticalhours,
                      @RequestParam(value = "labhours") Integer labhours,
                      @RequestParam(value = "credits") Integer credits
                      ) {
        Course course = new Course();
        course.setCourseID(courseid);
        course.setCourseName(coursename);
        course.setCourseType(coursetype);
        course.setAssessmentMethod(asseessmentmethod);
        course.setTheoreticalHours(theoreticalhours);
        course.setWeeklyHours(weeklyhours);
        course.setLabHours(labhours);
        course.setCredits(credits);

        return courseService.add(course);
    }
}
