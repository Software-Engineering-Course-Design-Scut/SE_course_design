package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {


    private Integer UserID;

    /**
     * 姓名
     */
    @TableField("Name")
    private String Name;

    /**
     * 类型（0、1、2分别对应“管理员”“教师”“学生”）
     */
    @TableField("UserType")
    private Integer UserType;

    /**
     * 密码
     */
    @TableField("Password")
    private String Password;


}
