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
 * 专业
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("major")
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专业ID
     */
    @TableId(value = "MajorID", type = IdType.AUTO)
    private Integer MajorID;

    /**
     * 专业名
     */
    private String MajorName;

    /**
     * 学院ID
     */
    private Integer CollegeID;


}
