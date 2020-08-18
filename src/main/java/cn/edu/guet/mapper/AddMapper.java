package cn.edu.guet.mapper;

import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;


public interface AddMapper {
    void insertTeacher(Teacher tea);
    void insertStudent(Student stu);
}
