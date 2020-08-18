package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.AddMapper;
import cn.edu.guet.mapper.DeleteMapper;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.IAddService;
import cn.edu.guet.service.IDeleteService;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteServiceImpl implements IDeleteService {

    @Autowired
    DeleteMapper deleteMapper;


    @Override
    public void deleteStudent(String id) {
        deleteMapper.deleteStudent(id);
    }

    @Override
    public void deleteTeacher(String id) {
        deleteMapper.deleteTeacher(id);
    }
}
