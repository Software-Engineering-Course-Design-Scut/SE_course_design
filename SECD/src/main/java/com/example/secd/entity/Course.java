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
 * 课程
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CourseID
     */
    @TableId(value = "CourseID", type = IdType.AUTO)
    private Integer CourseID;

    /**
     * 课程名
     */
    private String CourseName;

    /**
     * 课程类型
     */
    private String CourseType;

    /**
     * 考核方式
     */
    private String AssessmentMethod;

    /**
     * 周学时
     */
    private Integer WeeklyHours;

    /**
     * 理论学时
     */
    private Integer TheoreticalHours;

    /**
     * 实验学时
     */
    private Integer LabHours;

    /**
     * 学分
     */
    private Integer Credits;


}
