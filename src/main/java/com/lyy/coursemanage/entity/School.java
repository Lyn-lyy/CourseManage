package com.lyy.coursemanage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: CourseManage
 * @description: 学院实体
 * @author: LYY
 * @create: 2022-04-30 20:16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private int id;
    private String schoolName;
}
