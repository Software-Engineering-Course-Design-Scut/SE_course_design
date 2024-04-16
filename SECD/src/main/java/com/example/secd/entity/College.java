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
public class College implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学院ID
     */
    @TableId(value = "CollegeID", type = IdType.AUTO)
    private Integer CollegeID;

    /**
     * 学院名
     */
    private String CollegeName;


}
