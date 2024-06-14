package com.example.secd.controller;


import com.example.secd.entity.User;
import com.example.secd.service.IClassroomService;
import com.example.secd.service.IUserService;
import org.springframework.web.bind.annotation.*;
import com.example.secd.Result;

import javax.annotation.Resource;
import com.example.secd.Result;
/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    IUserService userService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return userService.point();
    }
    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("userid") Integer id
    ){
        return userService.specific(id);
    }

    @PostMapping("/add")
    public Result add(@RequestParam("userid") Integer userid,
                      @RequestParam(value = "name") String name,
                      @RequestParam(value = "usertype") Integer usertype,
                      @RequestParam(value = "password") String password) {
        User user = new User();
        user.setUserID(userid);
        user.setName(name);
        user.setUserType(usertype);
        user.setPassword(password);
        return userService.add(user);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam("userid") Integer id) {
        return userService.delete(id);
    }
}
