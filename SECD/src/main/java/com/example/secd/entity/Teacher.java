package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 教师
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("teacher")
@ApiModel(value="Teacher对象", description="教师")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教师ID")
    @TableId(value = "TeacherID", type = IdType.AUTO)
    private Integer TeacherID;

    @ApiModelProperty(value = "姓名")
    private String Name;

    @ApiModelProperty(value = "性别")
    private String Gender;

    @ApiModelProperty(value = "地址")
    private String Address;

    @ApiModelProperty(value = "电话")
    private String PhoneNumber;

    @ApiModelProperty(value = "出生日期")
    private LocalDate DateOfBirth;

    @ApiModelProperty(value = "学历")
    private String Education;

    @ApiModelProperty(value = "职称")
    private String Title;

    @ApiModelProperty(value = "入职时间")
    private LocalDate HireDate;

    @ApiModelProperty(value = "学院ID")
    private Integer CollegeID;

    @ApiModelProperty(value = "用户类型（默认为1）")
    private Integer UserType;


}
