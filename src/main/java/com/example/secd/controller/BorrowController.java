package com.example.secd.controller;


import com.example.secd.Result;
import com.example.secd.entity.Book;
import com.example.secd.entity.Borrow;
import com.example.secd.service.IBorrowService;
import com.example.secd.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.Time;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2024-04-18
 */
@RestController
@RequestMapping("/borrow")
public class BorrowController {
    @Resource
    IBorrowService borrowService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return borrowService.point();
    }
    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("id") Integer id
    ){
        return borrowService.specific(id);
    }

    @PostMapping("/add")
    public Result add(@RequestParam("id") Integer id,
                      @RequestParam(value = "bookname") String bookname,
                      @RequestParam(value = "borrowtime") String borrowtime,
                      @RequestParam(value = "returntime") String returntime) {
        Borrow borrow = new Borrow();
        borrow.setId(id);
        borrow.setBookName(bookname);
        borrow.setBorrowTime(borrowtime);
        borrow.setReturnTime(returntime);
        return borrowService.add(borrow);
    }
    @DeleteMapping("/delete")
    public Result delete(@RequestParam("id") Integer id) {
        return borrowService.delete(id);
    }
}
