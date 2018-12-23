package com.tianyaxiang.springboot.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DashboardController
 *
 * @author tianya
 * @date 2018/7/22
 */
@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String index() {
        return "dashboard/index";
    }
}
