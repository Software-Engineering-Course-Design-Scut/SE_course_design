package com.example.secd.controller;


import com.example.secd.entity.Borrow;
import com.example.secd.entity.Major;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.IMajorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 专业 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/major")
public class MajorController {
    @Resource
    IMajorService majorService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return majorService.point();
    }
    @PostMapping("/add")
    public Result add(@RequestParam("majorid") Integer majorid,
                      @RequestParam(value = "majorname") String majorname,
                      @RequestParam(value = "collegeid") Integer collegeid) {
        Major major = new Major();
        major.setMajorID(majorid);
        major.setMajorName(majorname);
        major.setCollegeID(collegeid);
        return majorService.add(major);
    }
}
