package com.example.testdemo.service;

import com.example.testdemo.pojo.Student;

/**
 * @InterfaceName StudentService
 * @Author Elv1s
 * @Date 2019/7/15 15:17
 * @Description:
 */

public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    boolean addStudent(Student student);

    /**
     * 删除单个学生
     * @param sid  学号
     * @return 是否删除
     */
    boolean deleteStudent(int sid);
}
