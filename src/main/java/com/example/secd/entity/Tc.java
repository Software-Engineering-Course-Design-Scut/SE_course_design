package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class Tc implements Serializable {


    private Integer TeacherID;

    /**
     * 课程ID
     */
    private Integer CourseID;

    /**
     * 上课时间
     */
    private String ClassTime;

    /**
     * 教室ID
     */
    private Integer ClassroomID;


}
