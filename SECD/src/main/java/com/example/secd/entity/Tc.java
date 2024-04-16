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
 * 任教
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tc")
@ApiModel(value="Tc对象", description="任教")
public class Tc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教师ID")
    @TableId(value = "TeacherID", type = IdType.AUTO)
    private Integer TeacherID;

    @ApiModelProperty(value = "课程ID")
    private Integer CourseID;

    @ApiModelProperty(value = "上课时间")
    private String ClassTime;

    @ApiModelProperty(value = "教室ID")
    private Integer ClassroomID;


}
