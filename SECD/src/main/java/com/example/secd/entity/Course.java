package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value="Course对象", description="课程")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "CourseID")
    @TableId(value = "CourseID", type = IdType.AUTO)
    private Integer CourseID;

    @ApiModelProperty(value = "课程名")
    private String CourseName;

    @ApiModelProperty(value = "课程类型")
    private String CourseType;

    @ApiModelProperty(value = "考核方式")
    private String AssessmentMethod;

    @ApiModelProperty(value = "周学时")
    private Integer WeeklyHours;

    @ApiModelProperty(value = "理论学时")
    private Integer TheoreticalHours;

    @ApiModelProperty(value = "实验学时")
    private Integer LabHours;

    @ApiModelProperty(value = "学分")
    private Integer Credits;


}
