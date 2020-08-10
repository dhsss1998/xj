package jee.support.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import jee.support.constants.Constants;
import jee.support.dao.AdminDao;
import jee.support.dao.StudentDao;
import jee.support.entity.Admin;
import jee.support.entity.Score;
import jee.support.entity.Student;
import jee.support.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@Controller
@RequestMapping("/wxstudent")
public class WXcontroller {
    @Autowired
    AdminDao adminDao;
    @Autowired
    StudentService studentService;
    @Autowired
    StudentDao studentDao;
    @RequestMapping("/wxedit")
    public void toEdit(@Param("adminId") long adminId, HttpServletResponse response,HttpServletRequest request) throws IOException {
        //获取
        String result=null;
        response.setCharacterEncoding("UTF-8");
        Admin admin = adminDao.getAdminById(adminId);
        result=new Gson().toJson(admin);
        PrintWriter out=response.getWriter();
        out.println(result);
        out.close();
    }
    @RequestMapping("/wxupdate")
    public void update(@RequestParam("adminId") long adminId,@RequestParam("adminname") String adminname,
                       @RequestParam("email") String email,@RequestParam("password") String password,HttpServletResponse response){
         Admin admin=new Admin();
         admin.setAdminname(adminname);
         admin.setAdminId(adminId);
         admin.setPassword(password);
         admin.setEmail(email);
        adminDao.updateAdmin(admin);
    }
    @GetMapping("/wxlist")
    public void pageStudentList(@RequestParam(value = "page", defaultValue = "1") int page,
                                @RequestParam(value = "size", defaultValue = "10") int size,
        HttpServletResponse response) throws IOException {

            //默认每页记录
        String result=null;
            response.setCharacterEncoding("UTF-8");
            //PageInfo<Student> pageInfo = studentService.findStudentList(page, size);

       List<Student> list= studentDao.findAll();

       result=new Gson().toJson(list);
        PrintWriter out=response.getWriter();
        out.println(result);
        out.close();
        //return pageInfo;
    }
    @RequestMapping( "/search")
    public void selectStudent(@NotNull @RequestParam( "name") String name,HttpServletResponse response) throws IOException {
        String result=null;
        response.setCharacterEncoding("UTF-8");
        List<Student>  resultstudent =studentService.findByNameLike(name);
        System.out.println("123");
        result=new Gson().toJson(resultstudent);
        PrintWriter out=response.getWriter();
        out.println(result);
        out.close();
    }
    @RequestMapping("/wxcreate")
    public void createStudent(@RequestParam("name") String name ,@RequestParam("cellphone") String cellphone ,@RequestParam("sex") String sex ,@RequestParam("address") String address ,
                                HttpServletRequest request,
                              HttpServletResponse response) throws IOException {




            //将相关记录插入数据库
       Student student = new Student();
            //获取当前用户对象
        student.setName(name);
        student.setCellphone(cellphone);
        student.setSex(sex);
        student.setAddress(address);
            String result=null;
            response.setCharacterEncoding("UTF-8");
                 ;
        studentDao.addStudent(student);

            //执行相应的操作 例如输出
        result=new Gson().toJson(student);
        PrintWriter out=response.getWriter();
        out.println(result);
        out.close();
    }
    @RequestMapping("/wxscore")
    public void selectStudentScore(@NotNull @RequestParam( "studentId") long stduentId, Model model,HttpServletRequest request, HttpServletResponse response) throws IOException {

        //student是一个存储了数据的list集合
        //动态查询
//        List<Student>  resultstudent =studentService.findByNameAndSex(name);
        //模糊查询
        String result=null;
        List<Score>  resultstudent = studentService.findByStudentId(stduentId);
//
System.out.println("123");

        result=new Gson().toJson(resultstudent);
        PrintWriter out=response.getWriter();
        out.println(result);
        out.close();

    }
}
