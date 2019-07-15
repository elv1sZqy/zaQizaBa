package com.example.testdemo.service.impl;

import com.example.testdemo.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName StudentDao
 * @Author Elv1s
 * @Date 2019/7/15 15:18
 * @Description:
 */
@Mapper
public interface StudentDao {

    /**
     * 添加学生
     * @param student sid sname gid
     * @return
     */
    @Insert("insert into student (sid , sname , gid)  values ( #{sid} , #{sname} , #{gid})")
    boolean addStudent(Student student);

    /**
     * 删除单个学生
     * @param sid 学号
     * @return
     */
    @Delete("delete from student where sid = #{sid}")
    boolean deleteStudent(int sid);
}
