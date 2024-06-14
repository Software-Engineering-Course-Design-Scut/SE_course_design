package com.example.secd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.secd.Result;
import com.example.secd.entity.Book;
import com.example.secd.entity.Borrow;
import com.example.secd.mapper.BookMapper;
import com.example.secd.mapper.BorrowMapper;
import com.example.secd.service.IBorrowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class BorrowServiceImpl extends ServiceImpl<BorrowMapper, Borrow> implements IBorrowService {

    @Resource
    BorrowMapper borrowMapper;
    @Override
    public Result point() {

        List<Borrow> borrowList = borrowMapper.selectList(null);
        if (borrowList != null && !borrowList.isEmpty()) {
            return Result.ok(borrowList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result specific(Integer id) {

        QueryWrapper<Borrow> qw = new QueryWrapper<>();
        qw.eq("id", id);
        List<Borrow> borrowList = borrowMapper.selectList(null);
        if (borrowList != null && !borrowList.isEmpty()) {
            return Result.ok(borrowList);
        } else {
            return Result.fail("没有找到任何用户课程数据");
        }
    }

    @Override
    public Result add(Borrow borrow) {
        int result = borrowMapper.insert(borrow);
        if (result > 0) {
            return Result.ok("书籍添加成功");
        } else {
            return Result.fail("书籍添加失败");
        }
    }

    public Result delete(Integer id) {
        int result = borrowMapper.deleteById(id);
        if (result > 0) {
            return Result.ok("书籍删除成功");
        } else {
            return Result.fail("书籍删除失败");
        }
    }
}
