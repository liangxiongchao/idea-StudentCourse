package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MajorMapper;
import cn.edu.guet.mapper.StudentMapper;
import cn.edu.guet.model.Course;
import cn.edu.guet.model.Major;
import cn.edu.guet.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    MajorMapper majorMapper;



    @Override
    public List<Course> getCourse(String majorid) {
        List<Course> courseList=studentMapper.getCourse(majorid);
        return courseList;
    }

    @Override
    public List<Major> getMajor() {
        List<Major> majorList=majorMapper.getMajor();
        return majorList;
    }
}
