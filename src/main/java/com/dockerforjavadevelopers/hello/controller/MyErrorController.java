package com.dockerforjavadevelopers.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyErrorController implements ErrorController  {

    @RequestMapping("/error")
    public String handleError(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "error";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}