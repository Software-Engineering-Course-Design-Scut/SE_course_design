package com.example.secd.controller;


import com.example.secd.Result;
import com.example.secd.entity.Book;
import com.example.secd.service.IBookService;
import com.example.secd.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2024-04-18
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    IBookService bookService;
    @GetMapping("/all")// 绩效类的能力分返回
    public Result information(
    ){
        return bookService.point();
    }
    @GetMapping("/specific")// 绩效类的能力分返回
    public Result specific(@RequestParam("id") Integer id
    ){
        return bookService.specific(id);
    }

    @PostMapping("/add")
    public Result add(@RequestParam("id") Integer id,
                      @RequestParam(value = "bookname") String bookname,
                      @RequestParam(value = "status") Integer status) {
        Book book = new Book();
        book.setId(id);
        book.setBookName(bookname);
        book.setStatus(status);
        return bookService.add(book);
    }

}
