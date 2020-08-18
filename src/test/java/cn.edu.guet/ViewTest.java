package cn.edu.guet;

import cn.edu.guet.model.*;
import cn.edu.guet.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class ViewTest {

    @Autowired
    IViewService viewService;

    @Test
    public void getStudentById(){
        Student stu=viewService.getStudentById("1700720226");
        System.out.println(stu.getStudentName());
    }
    @Test
    public void getAllStudent(){
        List<Student> allStudent=viewService.getAllStudent();
        for (int i=0;i<allStudent.size();i++){
            System.out.println(allStudent.get(i).getStudentName());
        }
    }

    @Test
    public void getTeacherById(){
        Teacher tea=viewService.getTeacherById("007001");
        System.out.println(tea.getTeacherName());
    }
    @Test
    public void getAllTeacher(){
        List<Teacher> allTeacher=viewService.getAllTeacher();
        for (int i=0;i<allTeacher.size();i++){
            System.out.println(allTeacher.get(i).getTeacherName());
        }
    }
}