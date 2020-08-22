package cn.edu.guet.controller;

import cn.edu.guet.model.Clazz;
import cn.edu.guet.model.School;
import cn.edu.guet.model.Student;
import cn.edu.guet.model.Teacher;
import cn.edu.guet.service.IUserService;
import cn.edu.guet.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService userService;
    Result result=new Result();

    @RequestMapping(value = "/getStudentById", method = RequestMethod.GET)
    @ResponseBody
    public Result getStudentById(String id){
        if (id == null) {
            return result.fail("请输入id");
        }
        Student stu=userService.getStudentById(id);
        if (stu == null) {
            return result.fail("无该学生");
        }
        return result.succ(stu);
    }

    @RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllStudent(){
        List<Student> studentList=userService.getAllStudent();
        if (studentList == null) {
            return result.fail("没有学生");
        }
        return result.succ(studentList);
    }

    @RequestMapping(value = "/getTeacherById", method = RequestMethod.GET)
    @ResponseBody
    public Result getTeacherById(String id){
        if (id == null) {
            return result.fail("请输入id");
        }
        Teacher tea=userService.getTeacherById(id);
        if (tea == null) {
            return result.fail("无该老师");
        }
        return result.succ(tea);
    }

    @RequestMapping(value = "/getAllTeacher", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllTeacher(){
        List<Teacher> teacherList=userService.getAllTeacher();
        if (teacherList == null) {
            return result.fail("没有老师");
        }
        return result.succ(teacherList);
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result addStudent(String classId,String studentId,String studentName){
        Clazz clazz=userService.getClazzById(classId);
        Student stu=new Student();
        stu.setStudentName(studentName);
        stu.setStudentId(studentId);
        stu.setClazz(clazz);
        List<Student> studentList=userService.getAllStudent();
        try {
            userService.addStudent(stu);
            return result.succ(200,"添加成功",stu);
        } catch (Exception e) {
            for(int i=0;i<studentList.size();i++) {
                if(classId==null){
                    return result.fail("班级不存在");
                }else if(stu.getStudentId().contains(studentList.get(i).getStudentId())){
                    return result.fail("该学生已存在");
                }
            }
        }
        return null;
    }
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
    @ResponseBody
    public Result deleteStudent(String id){
        userService.deleteStudent(id);
        return result.succ("删除成功");
    }

    //添加老师
    @RequestMapping(value = "/addTeacher", method = RequestMethod.POST)
    @ResponseBody
    public Result addTeacher(String teacherId,String teacherName,String schoolId){
        Teacher teacher=new Teacher();
        School school=userService.getSchoolById(schoolId);
        teacher.setTeacherId(teacherId);
        teacher.setTeacherName(teacherName);
        teacher.setSchool(school);
        List<Teacher> allteacher=userService.getAllTeacher();
        try {
            userService.addTeacher(teacher);
            return result.succ(200, "添加老师成功", null);
        } catch (Exception e) {
            e.printStackTrace();
            for (int i = 0; i < allteacher.size(); i++) {
                if (school == null) {
                    return result.fail("学院不存在");
                } else if(teacher.getTeacherId().contains(allteacher.get(i).getTeacherId())) {
                    return result.fail("该老师已存在");
                }
            }
        }
        return null;
    }

    //删除老师
    @RequestMapping(value = "/deleteTeacher", method = RequestMethod.GET)
    @ResponseBody
    public Result deleteTeacher(String teacherId){
        if(teacherId==null){
            return result.fail("删除老师失败");
        }else{
            userService.deleteTeacher(teacherId);
            return result.succ(200,"删除老师成功",null);
        }
    }

}
