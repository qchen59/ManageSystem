package cn.managesystem.controller;

import cn.managesystem.entity.Project;
import cn.managesystem.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ProjectDetailController {
    @Resource
    private ProjectService projectService;



    @RequestMapping(value="/projectDetail/{id}")
    public String projectDetail(@PathVariable("id")int id, final Model model){
        Project project = this.projectService.findProjectById(id);
        model.addAttribute("selectedProject", project);
        return "projectDetail";
    }
}