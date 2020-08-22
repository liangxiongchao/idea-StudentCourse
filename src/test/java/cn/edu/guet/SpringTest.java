package cn.edu.guet;

import cn.edu.guet.model.Course;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import cn.edu.guet.service.IStudentService;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class SpringTest {
    @Autowired
    IMenuService menuService;

    @Test
    public void Test(){
        List<Menu> menuList=menuService.getMenuById("007001");
        for (int i=0; i<menuList.size(); i++){
            System.out.println(menuList.get(i).getMenuId()+menuList.get(i).getMenuName());
        }
    }


    @Autowired
    IStudentService studentService;
    @Test
    public void testCourse(){
        List<Course> courseList=studentService.getCourse("200");
        for (int i=0; i<courseList.size(); i++){
            System.out.println(courseList.get(i).getCourseName()+courseList.get(i).getTeacher().getTeacherName());
        }
        Gson gson=new Gson();
        System.out.println(gson.toJson(courseList));

    }
}