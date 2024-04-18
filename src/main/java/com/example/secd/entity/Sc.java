package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 选修
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sc")
public class Sc implements Serializable {


    private Integer StudentID;

    /**
     * 课程ID
     */
    private Integer CourseID;

    /**
     * 教师ID
     */
    private Integer TeacherID;

    /**
     * 成绩
     */
    private Integer Grade;


}
