package cn.managesystem.service;

import cn.managesystem.entity.FileData;
import cn.managesystem.entity.Project;
import cn.managesystem.entity.ProjectDto;

import java.util.List;

public interface ProjectService {

    public Project findProjectById(int id);
    public List<FileData> getFileData(int id, String type);
    public FileData getFileDataById(int id);
    public void saveProject(ProjectDto project);
    public void updateProject(Project project);
    public List<Project> getProjects();


}
