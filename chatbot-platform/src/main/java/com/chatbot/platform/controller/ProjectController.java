package com.chatbot.platform.controller;

import com.chatbot.platform.model.Project;
import com.chatbot.platform.service.ProjectService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // CREATE PROJECT
    @PostMapping
    public Project createProject(@RequestBody Project project,
                                 Authentication authentication) {

        String email = authentication.getName();
        return projectService.createProject(project, email);
    }

    // GET MY PROJECTS
    @GetMapping
    public List<Project> getMyProjects(Authentication authentication) {

        String email = authentication.getName();
        return projectService.getMyProjects(email);
    }
}

