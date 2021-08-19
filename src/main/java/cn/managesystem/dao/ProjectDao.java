package cn.managesystem.dao;

import cn.managesystem.entity.Project;

import java.util.List;

public interface ProjectDao {

    Project findProjectById(int id);
    List<Project> getProjects();
    void saveProject(Project project);
    void updateProject(Project project);
}
