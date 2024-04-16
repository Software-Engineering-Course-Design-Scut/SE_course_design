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
@ApiModel(value="Sc对象", description="选修")
public class Sc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生ID")
    @TableId(value = "StudentID", type = IdType.AUTO)
    private Integer StudentID;

    @ApiModelProperty(value = "课程ID")
    private Integer CourseID;

    @ApiModelProperty(value = "教师ID")
    private Integer TeacherID;

    @ApiModelProperty(value = "成绩")
    private Integer Grade;


}
