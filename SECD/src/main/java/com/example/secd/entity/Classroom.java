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
 * 教室
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("classroom")
@ApiModel(value="Classroom对象", description="教室")
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教室ID")
    @TableId(value = "ClassroomID", type = IdType.AUTO)
    private Integer ClassroomID;

    @ApiModelProperty(value = "教室名")
    private String ClassroomName;


}
