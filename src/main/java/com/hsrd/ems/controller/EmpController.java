package com.hsrd.ems.controller;

import com.hsrd.ems.entity.Emp;
import com.hsrd.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@Transactional
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @PostMapping("update")
    public String update(String name){
        empService.update(name);
        return "redirect:/emp/findAll";
    }
    @GetMapping("findOne")
    public String findOne(String name, Model model){
        Emp emp = empService.findByName(name);
        model.addAttribute("emp",emp);
        return "redirect:/update.jsp";
    }
    @GetMapping("delete")
    public String delete(String name){
        empService.delete(name);
        return "redirect:/emp/findAll";
    }

    @PostMapping("save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }
    @GetMapping("findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "redirect:/emplist.jsp";
    }
}
