package com.example.testdemo.controller;

import com.example.testdemo.pojo.Student;
import com.example.testdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName StudentController
 * @Author Elv1s
 * @Date 2019/7/15 15:17
 * @Description:
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 添加单个学生
     * @param student  sid 学号  sname 姓名  gid 所属班级
     * @return
     */
    @PostMapping("/add")
    public String addStudent(Student student){
        // 保存
        boolean isSuccess = studentService.addStudent(student);
        if (isSuccess){
            return "success";
        }
        return "false";
    }

    /**
     * 删除单个学生
     * @param sid 学号
     * @return
     */
    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid){
        boolean isSuccess = studentService.deleteStudent(sid);
        if (isSuccess){
            return "success";
        }
        return "false";
    }

}
