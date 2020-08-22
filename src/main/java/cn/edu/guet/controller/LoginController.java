package cn.edu.guet.controller;

import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import cn.edu.guet.util.Result;
import cn.edu.guet.service.ILoginService;
import cn.edu.guet.util.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    ILoginService loginService;
    @Autowired
    IMenuService menuService;

    Result result=new Result();

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(String username,String password){
        System.out.println("登陆控制器"+username);
        System.out.println("控制器"+password);
        Object user=loginService.login(username,password);

        if (user==null){
            return result.fail("用户名或密码不正确");
        }
        else{
            List<Menu> menuList=menuService.getMenuById(username);
            return result.succ(200,"登陆成功",menuList);
        }
    }
}
