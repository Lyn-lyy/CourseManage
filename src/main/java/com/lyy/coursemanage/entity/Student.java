package com.lyy.coursemanage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: CourseManage
 * @description: 学生实体
 * @author: LYY
 * @create: 2022-04-30 20:15
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer hours;
    private Integer sid;
    private String headurl;
}
