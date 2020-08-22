package cn.edu.guet.mapper;

import cn.edu.guet.model.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Course> getCourse(@Param("majorid") String majorid);
}
