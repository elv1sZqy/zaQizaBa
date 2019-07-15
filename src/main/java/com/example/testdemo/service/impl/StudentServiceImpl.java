package com.example.testdemo.service.impl;

import com.example.testdemo.pojo.Student;
import com.example.testdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentServiceImpl
 * @Author Elv1s
 * @Date 2019/7/15 15:17
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public boolean deleteStudent(int sid) {
        return studentDao.deleteStudent(sid);
    }
}
