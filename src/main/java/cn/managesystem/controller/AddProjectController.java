package cn.managesystem.controller;

import cn.managesystem.entity.Project;
import cn.managesystem.entity.ProjectDto;
import cn.managesystem.service.ProjectService;
import cn.managesystem.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AddProjectController {
    @Resource
    public ProjectService projectService;

    @RequestMapping("addProject")
    public String getPage ( final Model model ) {
        return "addProject";
    }

    @RequestMapping(value = "/addNewProject", method = RequestMethod.POST,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String saveProject(ProjectDto project, BindingResult bindingResult) {
        System.out.println(bindingResult.getAllErrors());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        project.setCreateTime(formatter.format(date));
        projectService.saveProject(project);
        return "redirect:/searchProject";
    }



}
