package com.example.testdemo.service;

import com.example.testdemo.pojo.Grade;

/**
 * @InterfaceName GradeService
 * @Author Elv1s
 * @Date 2019/7/15 14:46
 * @Description:
 */

public interface GradeService {

    /**
     * 添加班级
     * @param grade  包括班级编号, 名称
     * @return
     */
    boolean add(Grade grade);

    /**
     * 删除班级  如果班级里存在学生, 将会一并删除
     * @param gid  班级id
     * @return
     */
    boolean deleteGrade(int gid);
}
