package cn.edu.guet.mapper;

import cn.edu.guet.model.Clazz;
import cn.edu.guet.model.School;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;

import java.util.List;

public interface ViewMapper {
    Teacher getTeacherById(String id);
    List<Teacher> getAllTeacher();
    List<Student> getAllStudent();
    Student getStudentById(String id);
    Clazz getClazzById(String id);
    School getSchoolById(String id);
}
