package com.tianyaxiang.springboot.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 *
 * @author tianya
 * @date 2018/7/22
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
