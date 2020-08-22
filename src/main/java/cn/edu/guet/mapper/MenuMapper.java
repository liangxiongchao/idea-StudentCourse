package cn.edu.guet.mapper;

import cn.edu.guet.model.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    List<Menu> getMenuById(@Param("roleid") String roleid);
    List<Menu> getChildMenuById(String id);
    List<Menu> getAllMenus();
}
