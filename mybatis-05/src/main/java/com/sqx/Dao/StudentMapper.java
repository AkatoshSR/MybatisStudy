package com.sqx.Dao;

import com.sqx.Pojo.Student;

import java.util.List;

public interface StudentMapper {

    // 查询所有学生信息
    List<Student> getStudent();

}
