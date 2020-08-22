package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuServiceImpl implements IMenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenu() {
        System.out.println("bbbb");
        List<Menu> menuList=menuMapper.getAllMenus();
        return menuList;
    }

    @Override
    public List<Menu> getMenuById(String username) {
        String roleid=null;
        if (username.length()==6){
            roleid="R002";
        }
        else if (username.length()==10){
            roleid="R001";
        }
        else if ("17007".equals(username)){
            roleid="R003";
        }

        List<Menu> menuList=menuMapper.getMenuById(roleid);
        return menuList;
    }


}
