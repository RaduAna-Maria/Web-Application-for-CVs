package com.example.resumewebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

import com.example.resumewebapp.model.resumeItem;
import com.example.resumewebapp.service.resumeItemService;

import jakarta.validation.Valid;

@Controller
public class getResumeController {
    @Autowired
    private resumeItemService service;

    @GetMapping("/get-resume")
    public String showCreateForm(resumeItem item){
        return "get_resume";
    }

    @PostMapping("/search-resume")
    public String getResumeByName(@Valid resumeItem resume, BindingResult result, Model model) {
        Optional<resumeItem> retrievedResume = service.getResumeByName(resume.getName());

        if (retrievedResume.isPresent()) {
            model.addAttribute("resumeItems", retrievedResume.get());
            return "returned_resume";
        } else {
            model.addAttribute("errorMessage", "Resume not found");
            return "error_page";
        }
    }
}
