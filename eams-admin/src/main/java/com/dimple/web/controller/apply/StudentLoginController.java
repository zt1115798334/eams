package com.dimple.web.controller.apply;

import com.dimple.common.core.domain.AjaxResult;
import com.dimple.maintenance.domain.Student;
import com.dimple.maintenance.service.EamsProfessionService;
import com.dimple.maintenance.service.EamsStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @className: StudentLoginController
 * @description: 学生登录
 * @auther: Dimple
 * @date: 04/26/19
 * @version: 1.0
 */
@Controller("/f")
public class StudentLoginController {

    @Autowired
    EamsStudentService studentService;
    @Autowired
    EamsProfessionService professionService;


    @GetMapping("/f/login")
    public String login() {
        return "apply/login";
    }

    @PostMapping("/f/login")
    @ResponseBody
    public AjaxResult login(String password, String username, HttpSession session) {
        Student student = studentService.selectStudentByStuNumAndIdCard(username, password);
        if (student == null) {
            return AjaxResult.warn("数据不匹配，请重新输入");
        }
        student.setProfName(professionService.selectProfessionFullNameByProfId(student.getProfId()));
        session.setAttribute("student", student);
        return AjaxResult.success("数据匹配成功");
    }

    @PostMapping("/f/logout")
    public String logout(HttpSession session) {
        Enumeration<String> attributeNames = session.getAttributeNames();

        while (attributeNames.hasMoreElements()) {
            //清空session
            session.removeAttribute(attributeNames.nextElement());
        }
        return "apply/login";
    }
}
