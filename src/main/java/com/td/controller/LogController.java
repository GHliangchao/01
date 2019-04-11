package com.td.controller;

import com.td.pojo.Log;
import com.td.pojo.User;
import com.td.service.Impl.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogController {

    @Autowired
    private LogServiceImpl logService;

    @RequestMapping("/addLog")
    public Log addLogById(Log log) {
        Log res = logService.addLog(log);
        return res;
    }

    @RequestMapping("/showLogById")
    public String showLogById(Model model, long id) {
        model.addAttribute("Log", logService.showLogById(id));
        return "showLogById";
    }

    @RequestMapping("/showAllLog")
    public String showAllLog(Model model) {
        model.addAttribute("LogList", logService.showAllLog());
        return "showAllLog";
    }

    @RequestMapping("/updateLog")
    public String updateLog(Model model, Log log) {
        logService.updateLog(log);
        log = logService.showLogById(log.getId());
        model.addAttribute("update", log);
        return "updateLog";
    }

    @RequestMapping("/login")
    public String login(HttpSession session,Model model, Log log) {
        User user = new User();

        model.addAttribute("login", logService.Login(log));

        Integer id = log.getId();
        String name = log.getName();
        String passwd = log.getPasswd();
        user.setId(id);
        return "login";
    }



}
