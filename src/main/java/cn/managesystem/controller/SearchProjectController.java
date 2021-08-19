package cn.managesystem.controller;


import cn.managesystem.entity.Project;
import cn.managesystem.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("")
public class SearchProjectController {

    @Resource
    private ProjectService projectService;

    @RequestMapping("searchProject")
    public String findProject(Model model) {
//        int id = 1;
//        Project project = this.projectService.findProjectById(id);
//        model.addAttribute("project", project);
        List<Project> projectList = this.projectService.getProjects();
        System.out.println("How many projects: " + projectList.size());
        model.addAttribute("projectList", projectList);
        return "searchProject";
    }


}
