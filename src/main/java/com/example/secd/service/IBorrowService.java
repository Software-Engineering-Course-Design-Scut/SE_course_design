package com.example.secd.service;

import com.example.secd.Result;
import com.example.secd.entity.Borrow;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2024-04-18
 */
public interface IBorrowService extends IService<Borrow> {

    Result point();

    Result specific(Integer id);

    Result add(Borrow borrow);
}
