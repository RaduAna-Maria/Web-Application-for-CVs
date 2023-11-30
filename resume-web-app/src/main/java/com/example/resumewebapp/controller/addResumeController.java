package com.example.resumewebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.resumewebapp.model.resumeItem;
import com.example.resumewebapp.service.resumeItemService;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
public class addResumeController {
    @Autowired
    private resumeItemService service;

    @GetMapping("/add-resume")
    public String showCreateForm(resumeItem item){
        return "add_resume";
    }

    @PostMapping("/save-resume")
    public String createResumeItem(@Valid resumeItem resume, BindingResult result, Model model){
        resumeItem item = new resumeItem();
        item.setName(resume.getName());
        item.setSkills(resume.getSkills());
        item.setEducation(resume.getEducation());

        service.save(item);
        return "redirect:/";
    }
}
