package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ViewMapper;
import cn.edu.guet.model.Clazz;
import cn.edu.guet.model.School;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.IViewService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ViewServiceImpl implements IViewService {

    @Autowired
    ViewMapper viewMapper;

    @Override
    public Teacher getTeacherById(String id) {
        Teacher tea=viewMapper.getTeacherById(id);
        return tea;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        List<Teacher> teacherList=viewMapper.getAllTeacher();
        return teacherList;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList=viewMapper.getAllStudent();
        return studentList;
    }

    @Override
    public Student getStudentById(String id) {
        Student stu=viewMapper.getStudentById(id);
        return stu;
    }

    @Override
    public Clazz getClazzById(String id) {
        Clazz clazz=viewMapper.getClazzById(id);
        return clazz;
    }

    @Override
    public School getSchoolById(String id) {
        School school=viewMapper.getSchoolById(id);
        return school;
    }
}
