package com.dimple.web.controller.apply;

import com.dimple.apply.service.ApplyService;
import com.dimple.common.annotation.StudentAuth;
import com.dimple.common.core.controller.BaseController;
import com.dimple.common.core.page.TableDataInfo;
import com.dimple.evaluation.domain.Record;
import com.dimple.evaluation.service.EamsRecordService;
import com.dimple.maintenance.domain.Policy;
import com.dimple.maintenance.domain.Rule;
import com.dimple.maintenance.domain.Student;
import com.dimple.maintenance.service.EamsStudentService;
import com.dimple.system.domain.SysNotice;
import com.dimple.system.service.ISysNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @className: ApplyController
 * @description:
 * @auther: Dimple
 * @Date: 2019/4/19
 * @Version: 1.0
 */
@Controller
@RequestMapping("/f/apply")
public class ApplyController extends BaseController {

    @Autowired
    ApplyService applyService;
    @Autowired
    EamsStudentService studentService;
    @Autowired
    EamsRecordService recordService;
    @Autowired
    ISysNoticeService noticeService;

    @PostMapping()
    public String apply(@RequestBody Record[] records, HttpSession session) {
        Long ruleId = (Long) session.getAttribute("ruleId");
        Student student = (Student) session.getAttribute("student");
        int i = recordService.insertRecords(ruleId, student.getStuId(), records);
        return "apply/rule";
    }

    /**
     * 选择规则
     */
    @GetMapping("/rule")
    @StudentAuth
    public String selectRule(HttpSession session, Model model) {
        Student student = (Student) session.getAttribute("student");
        model.addAttribute("notices", noticeService.selectNoticeList(new SysNotice()));
        return "apply/rule";
    }

    @GetMapping("/rule/list")
    @ResponseBody
    @StudentAuth
    public TableDataInfo list(Rule rule,HttpSession session) {
        startPage();
        Student student = (Student) session.getAttribute("student");
        List<Rule> list = applyService.selectRuleList(rule, student.getStuId());
        return getDataTable(list);
    }

    @GetMapping("/rule/{ruleId}")
    @StudentAuth
    public String apply(@PathVariable Long ruleId, Model model, HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        session.setAttribute("ruleId", ruleId);
        model.addAttribute("student", studentService.selectStudentByStuNum(student.getStuNum()));
        //设置
        model.addAttribute("ruleId", ruleId);
        //设置属性表格的Root的id
        model.addAttribute("rootValue", applyService.selectRuleById(ruleId).getPolId());
        return "apply/apply";
    }

    @GetMapping("policy/list/{ruleId}")
    @ResponseBody
    @StudentAuth
    public List<Policy> list(@PathVariable Long ruleId) {
        List<Policy> policies = applyService.selectPolicyListByRuleId(ruleId);
        return policies;
    }

}
