package cn.managesystem.controller;

import cn.managesystem.entity.Project;
import cn.managesystem.entity.ProjectDto;
import cn.managesystem.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class EditProjectController {
    @Autowired
    public ProjectService projectService;


    @RequestMapping(value="/editProject/{id}")
    public String editProject(@PathVariable("id")int id, final Model model){
        Project project = this.projectService.findProjectById(id);
        model.addAttribute("selectedProject", project);
        return "editProject";
    }

    @RequestMapping(value = "/updateProject", method = RequestMethod.POST,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String updateProject(ProjectDto project, BindingResult bindingResult) {
        System.out.println(bindingResult.getAllErrors());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        project.setUpdateTime(formatter.format(date));
        projectService.updateProject(project);
        return "redirect:/editProject/" + project.getId();
    }
}