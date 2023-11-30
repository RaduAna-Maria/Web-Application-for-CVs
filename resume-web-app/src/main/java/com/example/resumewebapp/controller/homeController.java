package com.example.resumewebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.resumewebapp.service.resumeItemService;

@Controller
public class homeController {
    @Autowired
    private resumeItemService service;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("resumeItems", service.getAll());

        return model;
    }
}
