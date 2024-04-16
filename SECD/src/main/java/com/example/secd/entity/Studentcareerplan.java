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
 * 学生发展规划
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("studentcareerplan")
@ApiModel(value="Studentcareerplan对象", description="学生发展规划")
public class Studentcareerplan implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生发展规划ID")
    private Integer StudentCareerPlanID;

    @ApiModelProperty(value = "学生ID")
    private Integer StudentID;

    @ApiModelProperty(value = "发展规划建议")
    private String CareerPlanAdvice;


}
