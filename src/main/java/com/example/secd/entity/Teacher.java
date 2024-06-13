package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 教师
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("teacher")
public class Teacher implements Serializable {


    private Integer TeacherID;

    /**
     * 姓名
     */
    @TableField("Name")
    private String Name;

    /**
     * 性别
     */
    @TableField("Gender")
    private String Gender;

    /**
     * 地址
     */
    @TableField("Address")
    private String Address;

    /**
     * 电话
     */
    @TableField("PhoneNumber")
    private String PhoneNumber;

    /**
     * 出生日期
     */
    @TableField("DateOfBirth")
    private String DateOfBirth;

    /**
     * 学历
     */
    @TableField("Education")
    private String Education;

    /**
     * 职称
     */
    @TableField("Title")
    private String Title;

    /**
     * 入职时间
     */
    @TableField("HireDate")
    private String HireDate;

    /**
     * 学院ID
     */
    @TableField("CollegeID")
    private Integer CollegeID;

    /**
     * 用户类型（默认为1）
     */
    @TableField("UserType")
    private Integer UserType;


}
