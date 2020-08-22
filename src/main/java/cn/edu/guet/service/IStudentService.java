package cn.edu.guet.service;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.Major;

import java.util.List;

public interface IStudentService {
    List<Course> getCourse(String majorid);
    List<Major> getMajor();
}
