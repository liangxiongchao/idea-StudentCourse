package cn.edu.guet;

import cn.edu.guet.model.Clazz;
import cn.edu.guet.model.School;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.IUserService;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class UserTest {
    @Autowired
    IUserService userService;

    @Test
    public void getStudentById(){
        Student stu=userService.getStudentById("1700720226");
        System.out.println(stu.getStudentName());
    }
    @Test
    public void getAllStudent(){
        List<Student> allStudent=userService.getAllStudent();
        Gson gson=new Gson();
        System.out.println(gson.toJson(allStudent));
    }

    @Test
    public void getTeacherById(){
        Teacher tea=userService.getTeacherById("007001");
        System.out.println(tea.getTeacherName());
    }
    @Test
    public void getAllTeacher(){
        List<Teacher> allTeacher=userService.getAllTeacher();
        for (int i=0;i<allTeacher.size();i++){
            System.out.println(allTeacher.get(i).getTeacherName());
        }
    }

    @Test
    public void insertStudent(){
        Clazz clazz=userService.getClazzById("202");
        Student stu=new Student();
        stu.setStudentName("张三");
        stu.setStudentId("1700720202");
        stu.setClazz(clazz);
        try {
            userService.addStudent(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertTeacher(){
        School school=userService.getSchoolById("007");
        Teacher tea=new Teacher();
        tea.setTeacherId("007003");
        tea.setTeacherName("李四");
        tea.setSchool(school);
        userService.addTeacher(tea);
    }

    @Test
    public void deleteTeacher(){
        userService.deleteTeacher("007003");
    }
    @Test
    public void deleteStudent(){
        userService.deleteStudent("1700720202");
    }
}