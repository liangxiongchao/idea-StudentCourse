package cn.edu.guet;

import cn.edu.guet.model.Clazz;
import cn.edu.guet.model.School;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.IAddService;
import cn.edu.guet.service.IViewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class AddTest {

    @Autowired
    IAddService addService;
    @Autowired
    IViewService viewService;

    @Test
    public void insertStudent(){
        Clazz clazz=viewService.getClazzById("202");
        Student stu=new Student();
        stu.setStudentName("张三");
        stu.setStudentId("1700720202");
        stu.setClazz(clazz);
        addService.insertStudent(stu);
    }

    @Test
    public void insertTeacher(){
        School school=viewService.getSchoolById("007");
        Teacher tea=new Teacher();
        tea.setTeacherId("007003");
        tea.setTeacherName("李四");
        tea.setSchool(school);
        addService.insertTeacher(tea);
    }
}