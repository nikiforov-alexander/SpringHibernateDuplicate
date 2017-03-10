package com.tejatummalapalli.instateam.web.controller;

import com.tejatummalapalli.instateam.dao.ProjectDao;
import com.tejatummalapalli.instateam.model.Project;
import com.tejatummalapalli.instateam.service.ProjectService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping("/projects")
    public String listProjects(Model model) {
        List<Project> projects= projectService.findAll();
        model.addAttribute("projects",projects);
        return "index";
    }
}