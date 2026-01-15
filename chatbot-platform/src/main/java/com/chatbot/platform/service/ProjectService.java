package com.chatbot.platform.service;

import com.chatbot.platform.model.Project;
import com.chatbot.platform.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(Project project, String email) {
        project.setCreatedBy(email);
        return projectRepository.save(project);
    }

    public List<Project> getMyProjects(String email) {
        return projectRepository.findByCreatedBy(email);
    }
}
