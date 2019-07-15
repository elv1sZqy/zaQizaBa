package com.example.testdemo.service;

import com.example.testdemo.dao.GradeDao;
import com.example.testdemo.pojo.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName GradeServiceImpl
 * @Author Elv1s
 * @Date 2019/7/15 14:46
 * @Description:
 */
@Service
@Transactional
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Override
    public boolean deleteGrade(int gid) {
        // 先删除班级中的学生
        gradeDao.deleteStudentByGid(gid);
        // 删除班级
        return gradeDao.deleteGrade(gid);
    }

    @Override
    public boolean add(Grade grade) {
        return gradeDao.add(grade);
    }
}
