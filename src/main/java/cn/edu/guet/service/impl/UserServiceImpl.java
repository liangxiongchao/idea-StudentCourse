package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.*;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Teacher getTeacherById(String id) {
        Teacher tea=userMapper.getTeacherById(id);
        return tea;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        List<Teacher> teacherList=userMapper.getAllTeacher();
        return teacherList;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList=userMapper.getAllStudent();
        return studentList;
    }

    @Override
    public Student getStudentById(String id) {
        Student stu=userMapper.getStudentById(id);
        return stu;
    }

    @Override
    public Clazz getClazzById(String id) {
        Clazz clazz=userMapper.getClazzById(id);
        return clazz;
    }

    @Override
    public School getSchoolById(String id) {
        School school=userMapper.getSchoolById(id);
        return school;
    }

    @Override
    public void deleteStudent(String id) {
        userMapper.deleteStudent(id);
    }

    @Override
    public void deleteTeacher(String id) {
        userMapper.deleteTeacher(id);
    }

    @Override
    public void addTeacher(Teacher tea) {
        userMapper.addTeacher(tea);
    }

    @Override
    public void addStudent(Student stu) throws Exception {
        userMapper.addStudent(stu);
    }
}
