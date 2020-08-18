package cn.edu.guet.service;

import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;


public interface IAddService {
    void insertTeacher(Teacher tea);
    void insertStudent(Student stu);
}
