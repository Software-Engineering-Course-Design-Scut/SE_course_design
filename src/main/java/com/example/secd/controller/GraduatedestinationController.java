package com.example.secd.controller;


import com.example.secd.entity.Course;
import com.example.secd.entity.Graduatedestination;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.IGraduatedestinationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 毕业去向 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/graduatedestination")
public class GraduatedestinationController {
    @Resource
    IGraduatedestinationService graduatedestinationService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return graduatedestinationService.point();
    }
    @PostMapping("/add")
    public Result add(@RequestParam("graduatedestinationid") Integer graduatedestinationid,
                      @RequestParam(value = "studentid") Integer studentid,
                      @RequestParam(value = "destinationtype") String destinationtype,
                      @RequestParam(value = "industrytype") Integer industrytype,
                      @RequestParam(value = "company") String company,
                      @RequestParam(value = "details") String details
    ) {
        Graduatedestination graduatedestination = new Graduatedestination();
        graduatedestination.setGraduateDestinationID(graduatedestinationid);
        graduatedestination.setStudentID(studentid);
        graduatedestination.setDestinationType(destinationtype);
        graduatedestination.setIndustryType(industrytype);
        graduatedestination.setCompany(company);
        graduatedestination.setDetails(details);


        return graduatedestinationService.add(graduatedestination);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam("studentid") Integer id) {
        return graduatedestinationService.delete(id);
    }
}
