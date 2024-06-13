package com.example.secd.service;

import com.example.secd.Result;
import com.example.secd.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2024-04-18
 */
public interface IBookService extends IService<Book> {

    Result point();

    Result specific(Integer id);


    Result add(Book book);
}
