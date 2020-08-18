package cn.edu.guet;

import cn.edu.guet.service.IDeleteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class DeleteTest {

    @Autowired
    IDeleteService deleteService;

    @Test
    public void deleteTeacher(){
        deleteService.deleteTeacher("007003");
    }
    @Test
    public void deleteStudent(){
        deleteService.deleteStudent("1700720202");
    }
}