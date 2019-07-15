package com.example.testdemo.controller;

import com.example.testdemo.pojo.Grade;
import com.example.testdemo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName GradeController
 * @Author Elv1s
 * @Date 2019/7/15 14:40
 * @Description:
 */
@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    GradeService gradeService;

    /**
     * 添加班级
     * @param grade
     * @return
     */
    @PostMapping("add")
    public String addGrade(Grade grade){
        // 保存
        boolean isSuccess = gradeService.add(grade);
        // 成功返回success
        if (isSuccess){
            return "save success";
        }
        // 失败返回false
        return "save false";
    }

    @DeleteMapping("/delete/{gid}")
    public String deleteGrade(@PathVariable int gid){
        boolean isSuccess = gradeService.deleteGrade(gid);
        // 成功返回success
        if (isSuccess){
            return " success";
        }
        // 失败返回false
        return " false";
    }


}
