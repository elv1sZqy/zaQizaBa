package com.example.testdemo.dao;

import com.example.testdemo.pojo.Grade;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName GradeDao
 * @Author Elv1s
 * @Date 2019/7/15 14:46
 * @Description:
 */
@Mapper
public interface GradeDao {

    /**
     * 添加班级
     * @param grade
     * @return
     */
    @Insert("insert into grade (gid , gname) values (#{gId} , #{gName})")
    boolean add(Grade grade);

    /**
     * 删除班级
     * @param gid 班级id
     * @return
     */
    @Delete("delete from grade where gid = #{gid}")
    boolean deleteGrade(int gid);

    /**
     * 删除 gid 班级里  所有的学生
     * @param gid
     * @return
     */
    @Delete("delete from student where gid = #{gid}")
    boolean deleteStudentByGid(int gid);
}
