package jee.support.controller;

import jee.support.dao.AdminDao;
import jee.support.entity.Admin;
import jee.support.service.AdminService;
import jee.support.service.StudentService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminDao adminDao;
    @Autowired
    StudentService studentService;
    @Autowired
    AdminService adminService;
    //更新对象
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Admin admin,Model model,@RequestParam("adminId") long adminId, HttpServletResponse response){

        adminDao.updateAdmin(admin);
        model.addAttribute("admin", admin);
        return "sessions";
    }
    @RequestMapping(value = "/edit/{adminId}", method = RequestMethod.GET)
    public String toEdit(@PathVariable("adminId") long adminId, @NotNull Model model){
        //获取
        Admin admin = adminDao.getAdminById(adminId);
        model.addAttribute("adminId", adminId);
        model.addAttribute("admin", admin);
        return "editAdmin";
    }


}
