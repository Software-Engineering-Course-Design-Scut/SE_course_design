package com.example.secd.mapper;

import com.example.secd.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 学生 Mapper 接口
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
