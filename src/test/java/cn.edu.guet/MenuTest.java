package cn.edu.guet;

import cn.edu.guet.model.*;
import cn.edu.guet.service.*;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class MenuTest {

    @Autowired
    IMenuService menuService;
    @Test
    public void getAllMenu() {
        List<Menu> menuList=menuService.getMenu();
        Gson gson=new Gson();
        System.out.println(gson.toJson(menuList));
    }
}