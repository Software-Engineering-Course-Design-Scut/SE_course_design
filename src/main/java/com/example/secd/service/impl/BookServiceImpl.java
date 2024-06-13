package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.Result;
import com.example.secd.entity.Book;
import com.example.secd.entity.Tc;
import com.example.secd.mapper.BookMapper;
import com.example.secd.mapper.TcMapper;
import com.example.secd.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2024-04-18
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Resource
    BookMapper bookMapper;
    @Override
    public Result point() {

        List<Book> bookList = bookMapper.selectList(null);
        if (bookList != null && !bookList.isEmpty()) {
            return Result.ok(bookList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.eq("id", id);
        List<Book> bookList = bookMapper.selectList(qw);
        if (bookList != null && !bookList.isEmpty()) {
            return Result.ok(bookList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Book book) {
        int result = bookMapper.insert(book);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }


}
