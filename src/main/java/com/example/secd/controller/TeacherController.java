package com.example.secd.controller;


import com.example.secd.entity.Borrow;
import com.example.secd.entity.Course;
import com.example.secd.entity.Teacher;
import com.example.secd.entity.User;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.ITeacherService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 教师 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    ITeacherService teacherService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return teacherService.point();
    }
    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("teacherid") Integer id
    ){
        return teacherService.specific(id);
    }

    @PostMapping("/add")
    public Result add(@RequestParam("teacherid") Integer teacherid,
                      @RequestParam(value = "name") String name,
                      @RequestParam(value = "gender") String gender,
                      @RequestParam(value = "address") String address,
                      @RequestParam(value = "phonenumber") String phonenumber,
                      @RequestParam(value = "dateofbirth") String dateofbirth,
                      @RequestParam(value = "education") String education,
                      @RequestParam(value = "title") String title,
                      @RequestParam(value = "hiredate") String hiredate,
                      @RequestParam(value = "collegeid") Integer collegeid,
                      @RequestParam(value = "usertype") Integer usertype
    ) {
        Teacher teacher = new Teacher();
        teacher.setTeacherID(teacherid);
        teacher.setName(name);
        teacher.setGender(gender);
        teacher.setAddress(address);
        teacher.setPhoneNumber(phonenumber);
        teacher.setDateOfBirth(dateofbirth);
        teacher.setEducation(education);
        teacher.setTitle(title);
        teacher.setHireDate(hiredate);
        teacher.setCollegeID(collegeid);
        teacher.setUserType(usertype);

        return teacherService.add(teacher);
    }
}
