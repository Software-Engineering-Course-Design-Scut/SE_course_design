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
 * 学院
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("college")
@ApiModel(value="College对象", description="学院")
public class College implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学院ID")
    @TableId(value = "CollegeID", type = IdType.AUTO)
    private Integer CollegeID;

    @ApiModelProperty(value = "学院名")
    private String CollegeName;


}
