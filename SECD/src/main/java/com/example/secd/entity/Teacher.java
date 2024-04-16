package com.example.secd.entity;

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
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("teacher")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教师ID
     */
    @TableId(value = "TeacherID", type = IdType.AUTO)
    private Integer TeacherID;

    /**
     * 姓名
     */
    private String Name;

    /**
     * 性别
     */
    private String Gender;

    /**
     * 地址
     */
    private String Address;

    /**
     * 电话
     */
    private String PhoneNumber;

    /**
     * 出生日期
     */
    private LocalDate DateOfBirth;

    /**
     * 学历
     */
    private String Education;

    /**
     * 职称
     */
    private String Title;

    /**
     * 入职时间
     */
    private LocalDate HireDate;

    /**
     * 学院ID
     */
    private Integer CollegeID;

    /**
     * 用户类型（默认为1）
     */
    private Integer UserType;


}
