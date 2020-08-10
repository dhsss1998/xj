package jee.support.service;

import jee.support.dao.AdminDao;
import jee.support.entity.Admin;
import jee.support.entity.Student;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//可以使用AdminDao封装好的接口，对Admin对象CRUD操作
//注释使得该类成为service层
@Service
@Transactional
public class AdminService {

    //    自动装配bean
    @Autowired

    AdminDao adminDao;
    //通过id获取管理信息，调用AdminDao接口里面的getAdminById()
    @Transactional
    public Admin getAdmin(long id){
        return  adminDao.getAdminById(id);
    }

    @Transactional
    public int  updateAdmin(long id, Admin admin) {
        admin.setAdminId(id); //设置更新的ticket的id
        return adminDao.updateAdmin(admin);
    }

    // 添加管理员，调用AdminDao接口里面的addAdmin()方法，返回新用户对应的id号
    @Transactional                 //声明式事务管理
    public long addAdmin(Admin admin) {
           return adminDao.addAdmin(admin);
    }

    @Transactional
    public  void deleteAdminById(long id){
        adminDao.deleteAdmin(id);
    }
//    用户名重复检测
    public  Admin findByAdminname(String adminname){
        return adminDao.findByAdminname(adminname);

    }
    public Admin getAdminById(long id){
        return adminDao.getAdminById(id);
    }


    //校验是否存在该用户,不存在则返回null,存在则返回用户
    //使用@Param来传递参数,传入参数为username和password
    public Admin authenticate( String adminname,String password){
        return adminDao.findByNameAndPwd(adminname, password);
    }


    public static void main(String[] args) {
//        bena装配工厂
        BeanFactory factory = new ClassPathXmlApplicationContext("config" +
                "/applicationContext.xml");
        System.out.println(factory);
        AdminService adminService = (AdminService) factory.getBean("adminService");
        System.out.println(adminService);
        System.out.println(adminService.getAdmin(1L).getAdminname());
    }

}

