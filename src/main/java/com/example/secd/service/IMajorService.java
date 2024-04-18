package com.example.secd.service;

import com.example.secd.entity.Major;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.secd.Result;
/**
 * <p>
 * 专业 服务类
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
public interface IMajorService extends IService<Major> {
    Result point();
}
