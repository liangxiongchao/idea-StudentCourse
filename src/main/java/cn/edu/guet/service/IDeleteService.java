package cn.edu.guet.service;

import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;


public interface IDeleteService {
    void deleteStudent(String id);
    void deleteTeacher(String id);
}
