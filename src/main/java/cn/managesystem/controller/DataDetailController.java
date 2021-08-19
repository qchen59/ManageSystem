package cn.managesystem.controller;

import cn.managesystem.entity.FileData;
import cn.managesystem.entity.Project;
import cn.managesystem.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class DataDetailController {

    @Resource
    private ProjectService projectService;

    private String savePath = "/Users/cqy_ct/workspace/temp/";



    @RequestMapping(value="/dataDetail/planFile/{id}")
    public String projectDetailPlan(@PathVariable("id")int id, final Model model){
        List<FileData> fileList = this.projectService.getFileData(id,"plan");
        System.out.println("How many files: " + fileList.size());
        model.addAttribute("fileList", fileList);
        model.addAttribute("projectID", id);
        return "dataDetail";
    }

    @RequestMapping(value="/dataDetail/fundingFile/{id}")
    public String projectDetailFunding(@PathVariable("id")int id, final Model model){
        System.out.println("I am here!");
        List<FileData> fileList = this.projectService.getFileData(id,"funding");
        System.out.println("How many files: " + fileList.size());
        model.addAttribute("fileList", fileList);
        model.addAttribute("projectID", id);
        return "dataDetail";
    }

    @RequestMapping(value="/dataDetail/reportFile/{id}")
    public String projectDetailReport(@PathVariable("id")int id, final Model model){
        List<FileData> fileList = this.projectService.getFileData(id, "report");
        System.out.println("How many files: " + fileList.size());
        model.addAttribute("fileList", fileList);
        model.addAttribute("projectID", id);
        return "dataDetail";
    }

    @RequestMapping(value="/dataDetail/deliveryFile/{id}")
    public String projectDetailDelivery(@PathVariable("id")int id, final Model model){
        List<FileData> fileList = this.projectService.getFileData(id, "delivery");
        System.out.println("How many files: " + fileList.size());
        model.addAttribute("fileList", fileList);
        model.addAttribute("projectID", id);
        return "dataDetail";
    }

    @RequestMapping(value="/dataDetail/modelFile/{id}")
    public String projectDetailModel(@PathVariable("id")int id, final Model model){
        List<FileData> fileList = this.projectService.getFileData(id, "model");
        System.out.println("How many files: " + fileList.size());
        model.addAttribute("fileList", fileList);
        model.addAttribute("projectID", id);
        return "dataDetail";
    }

    @RequestMapping(value="/dataDetail/collFile/{id}")
    public String projectDetailColl(@PathVariable("id")int id, final Model model){
        List<FileData> fileList = this.projectService.getFileData(id, "coll");
        System.out.println("How many files: " + fileList.size());
        model.addAttribute("fileList", fileList);
        model.addAttribute("projectID", id);
        return "dataDetail";
    }

    @RequestMapping(value="/down/{id}")
    public void down(@PathVariable("id")String id, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String fileName = this.projectService.getFileDataById(Integer.parseInt(id)).getFileName();
        System.out.println(fileName);
        String fullName = savePath + fileName;
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fullName)));
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName,"UTF-8"));
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }

}
