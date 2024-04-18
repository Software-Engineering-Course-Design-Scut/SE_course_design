package com.example.secd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.Year;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学生
 * </p>
 *
 * @author HuuIris
 * @since 2024-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("student")
public class Student implements Serializable {


    private Integer StudentID;

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
     * 入学年份
     */
    private Year EnrollmentYear;

    /**
     * 班级ID
     */
    private Integer ClassID;

    /**
     * 毕业高中类型（1：私立，2：公立，3：其他）
     */
    private Integer SchoolType;

    /**
     * 奖学金类型（1：无，2：25％，3：50％，4：75％，5：全额）
     */
    private Integer ScholarshipType;

    /**
     * 额外工作（1：是，2：否）
     */
    private Integer ExtraWork;

    /**
     * 定期艺术或体育活动（1：是，2：否）
     */
    private Integer Activities;

    /**
     * 是否有伴侣（1：有，2：没有）
     */
    private Integer Partner;

    /**
     * 工资总额（1：135-200 美元，2：201-270 美元，3：271-340 美元，4：341-410 美元，5：410 以上）
     */
    private Integer Salary;

    /**
     * 到大学的交通（1：公交车，2：私家车/出租车，3：自行车，4：其他）
     */
    private Integer TravelMode;

    /**
     * 住宿类型（1：出租，2：宿舍，3：与家人一起，4：其他）
     */
    private Integer Accommodation;

    /**
     * 母亲的教育程度1：小学，2：中学，3：高中，4：大学，5：硕士，6：博士）

     */
    private Integer MotherEducation;

    /**
     * 父亲的教育程度（1：小学，2：中学，3：高中，4：大学，5：硕士，6：博士）
     */
    private Integer FatherEducation;

    /**
     * 兄弟姐妹的数量（1: 1, 2:, 2, 3: 3, 4: 4, 5: 5 或以上）
     */
    private Integer SiblingNumber;

    /**
     * 父母状况（1：已婚，2：离婚，3：死亡 - 其中之一或两者）
     */
    private Integer ParentStatus;

    /**
     * 母亲的职业（1：退休，2：家庭主妇，3：政府官员，4：私营部门雇员，5：自营职业，6：其他）
     */
    private Integer MotherCareer;

    /**
     * 父亲的职业（1：退休，2：家庭主妇，3：政府官员，4：私营部门雇员，5：自营职业，6：其他）
     */
    private Integer FatherCareer;

    /**
     * 每周学习时间（1：无，2：<5小时，3：6-10小时，4：11-20小时，5：超过20小时）
     */
    private Integer WeeklyStudy;

    /**
     * 阅读频率_非科学（1：无，2：有时，3：经常）
     */
    private Integer ReadExtra;

    /**
     * 阅读频率_科学（1：无，2：有时，3：经常）
     */
    private Integer ReadScience;

    /**
     * 参与部门相关的研讨会/会议（1：是，2：否）
     */
    private Integer Seminar;

    /**
     * 上课情况（1：总是，2：有时，3：从不
     */
    private Integer AttendClass;

    /**
     * 期中考试准备（1：单独，2：与朋友一起，3：不适用）
     */
    private Integer ReviewMethods1;

    /**
     * 期中考试2的准备（1：最接近考试的日期，2：学期期间定期，3：从不）
     */
    private Integer ReviewMethods2;

    /**
     * 在课堂上做笔记（1：从不，2：有时，3：总是）
     */
    private Integer TakeNotes;

    /**
     * 上课听讲（1：从不，2：有时，3：总是）
     */
    private Integer ListenInClass;

    /**
     * 翻转课堂（1：没用，2：有用，3：不适用
     */
    private Integer FlippedCourse;

    /**
     * 上学期累计平均绩点（1：<2.00，2：2.00-2.49，3：2.50-2.99，4：3.00-3.49，5：3.49以上）
     */
    private Integer GPALastSemester;

    /**
     * 毕业时预期累计平均绩点（1：<2.00，2：2.00-2.49，3：2.50-2.99，4：3.00-3.49，5：3.49以上）
     */
    private Integer GPAAtGraduation;

    /**
     * 用户类型（默认为2）

     */
    private Integer UserType;


}
