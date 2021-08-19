package cn.managesystem.service;

import cn.managesystem.dao.FileDataDao;
import cn.managesystem.dao.ProjectDao;
import cn.managesystem.entity.FileData;
import cn.managesystem.entity.Project;
import cn.managesystem.entity.ProjectDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{

    @Resource
    private ProjectDao projectDao;

    @Resource
    private FileDataDao fileDataDao;

    private String savePath = "/Users/cqy_ct/workspace/temp/";


    public Project findProjectById(int id) {
        return projectDao.findProjectById(id);
    }
    public List<Project> getProjects() {
        return projectDao.getProjects();
    }
    public void saveProject(ProjectDto project){
        Project projectFinal = new Project();
        projectFinal.updateProject(project);
        System.out.println(project.toString());
        int projectId = getProjects().size() + 1;
        if (project.getCollFile() != null && project.getCollFile().getSize() > 0) {
            String collFileName = project.getCollFile().getOriginalFilename();
            File file = new File(savePath+collFileName);
            try {
                project.getCollFile().transferTo(file);
                FileData d = new FileData();
                d.setProjectId(projectId);
                d.setFileName(collFileName);
                d.setFileType("coll");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                d.setUploadTime(formatter.format(date));
                fileDataDao.saveFileData(d);

            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        if (project.getDeliveryFile() != null && project.getDeliveryFile().getSize() > 0) {
            String deliveryFileName = project.getDeliveryFile().getOriginalFilename();
            File file = new File(savePath+deliveryFileName);
            try {
                project.getDeliveryFile().transferTo(file);
                FileData d = new FileData();
                d.setProjectId(projectId);
                d.setFileName(deliveryFileName);
                d.setFileType("delivery");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                d.setUploadTime(formatter.format(date));
                fileDataDao.saveFileData(d);

            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        if (project.getPlanFile() != null && project.getPlanFile().getSize() > 0) {
            String planFileName = project.getPlanFile().getOriginalFilename();
            File file = new File(savePath+planFileName);
            try {
                project.getPlanFile().transferTo(file);
                FileData d = new FileData();
                d.setProjectId(projectId);
                d.setFileName(planFileName);
                d.setFileType("plan");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                d.setUploadTime(formatter.format(date));
                fileDataDao.saveFileData(d);

            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        if (project.getFundingFile() != null && project.getFundingFile().getSize() > 0) {
            String fundingFileName = project.getFundingFile().getOriginalFilename();
            File file = new File(savePath+fundingFileName);
            try {
                project.getFundingFile().transferTo(file);
                FileData d = new FileData();
                d.setProjectId(projectId);
                d.setFileName(fundingFileName);
                d.setFileType("funding");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                d.setUploadTime(formatter.format(date));
                fileDataDao.saveFileData(d);

            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        if (project.getReportFile() != null && project.getReportFile().getSize() > 0) {
            String reportFileName = project.getReportFile().getOriginalFilename();
            File file = new File(savePath+reportFileName);
            try {
                project.getReportFile().transferTo(file);
                FileData d = new FileData();
                d.setProjectId(projectId);
                d.setFileName(reportFileName);
                d.setFileType("report");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                d.setUploadTime(formatter.format(date));
                fileDataDao.saveFileData(d);

            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        if (project.getModelFile() != null && project.getModelFile().getSize() > 0) {
            String modelFileName = project.getModelFile().getOriginalFilename();
            File file = new File(savePath+modelFileName);
            try {
                project.getModelFile().transferTo(file);
                FileData d = new FileData();
                d.setProjectId(projectId);
                d.setFileName(modelFileName);
                d.setFileType("model");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                d.setUploadTime(formatter.format(date));
                fileDataDao.saveFileData(d);

            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        projectDao.saveProject(projectFinal);

    }

    public void updateProject(Project project) {
        projectDao.updateProject(project);
    }

    public List<FileData> getFileData(int id, String type) {
        return fileDataDao.getFileData(id, type);
    }
    public FileData getFileDataById(int id) {
        return fileDataDao.getFileDataById(id);
    }

}
