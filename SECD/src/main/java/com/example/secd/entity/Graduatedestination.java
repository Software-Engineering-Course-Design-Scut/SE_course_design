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
 * 毕业去向
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("graduatedestination")
@ApiModel(value="Graduatedestination对象", description="毕业去向")
public class Graduatedestination implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "毕业去向ID")
    @TableId(value = "GraduateDestinationID", type = IdType.AUTO)
    private Integer GraduateDestinationID;

    @ApiModelProperty(value = "学生ID")
    private Integer StudentID;

    @ApiModelProperty(value = "毕业去向类型（1：就业，2：升学，3：未就业）")
    private String DestinationType;

    @ApiModelProperty(value = "就业行业类型（1：公务员，2：国企。3：外企，4：私企，5：创业）")
    private Integer IndustryType;

    @ApiModelProperty(value = "就业单位")
    private String Company;

    @ApiModelProperty(value = "具体信息")
    private String Details;


}
