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
public class Studentcareerplan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生发展规划ID
     */
    private Integer StudentCareerPlanID;

    /**
     * 学生ID
     */
    private Integer StudentID;

    /**
     * 发展规划建议
     */
    private String CareerPlanAdvice;


}
