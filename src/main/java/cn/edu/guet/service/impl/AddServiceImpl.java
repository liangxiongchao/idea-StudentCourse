package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.AddMapper;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.IAddService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddServiceImpl implements IAddService {

    @Autowired
    AddMapper addMapper;

    @Override
    public void insertTeacher(Teacher tea) {
        addMapper.insertTeacher(tea);
    }

    @Override
    public void insertStudent(Student stu) {
        addMapper.insertStudent(stu);
    }
}
