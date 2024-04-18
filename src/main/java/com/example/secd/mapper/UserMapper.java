package com.example.secd.mapper;

import com.example.secd.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
