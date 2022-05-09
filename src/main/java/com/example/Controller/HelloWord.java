package com.example.Controller;

import com.example.Service.AdminuserService;
import com.example.entity.Adminuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
public class HelloWord {
//    @ResponseBody
//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello,Word";
//    }
    @Autowired
    AdminuserService adminuserService;

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping(value="doLogin",method = RequestMethod.POST)
//    @PostMapping("/two")
//      public String toTwo(String aduName,@RequestParam("aduPass") String aduPas){
//      public String toTwo(String aduName, String aduPass){
//        System.out.println(aduName +"---"+ aduPass);
//        return "two";
//    }
    public String doLogin(Adminuser adminuser,Model model){
        System.out.println(DigestUtils.md5DigestAsHex(adminuser.getAdupwd().getBytes()));
        adminuser.setAdupwd(DigestUtils.md5DigestAsHex(adminuser.getAdupwd().getBytes()));

        // 用户名 密码进行验证
        Adminuser user =  adminuserService.geAdminUser(adminuser);
        System.out.println(user);
        if (user == null){
            model.addAttribute("msg","用户名或密码不正确");
            return "login";
        }
        else{
            return "redirect:/admin/goods";
        }


    }
    @GetMapping("logout")
    public String doLogout(HttpSession session, SessionStatus sessionStatus){
        // 只是让session失效 但session仍然存在
        session.invalidate();
        sessionStatus.setComplete();
        return "login";
    }
}