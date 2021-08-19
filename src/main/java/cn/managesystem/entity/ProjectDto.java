package cn.managesystem.entity;

import org.springframework.web.multipart.MultipartFile;

public class ProjectDto extends Project {

    public MultipartFile getPlanFile() {
        return planFile;
    }

    public void setPlanFile(MultipartFile planFile) {
        this.planFile = planFile;
    }

    public MultipartFile getFundingFile() {
        return fundingFile;
    }

    public void setFundingFile(MultipartFile fundingFile) {
        this.fundingFile = fundingFile;
    }

    public MultipartFile getReportFile() {
        return reportFile;
    }

    public void setReportFile(MultipartFile reportFile) {
        this.reportFile = reportFile;
    }

    public MultipartFile getDeliveryFile() {
        return deliveryFile;
    }

    public void setDeliveryFile(MultipartFile deliveryFile) {
        this.deliveryFile = deliveryFile;
    }

    public MultipartFile getCollFile() {
        return collFile;
    }

    public void setCollFile(MultipartFile collFile) {
        this.collFile = collFile;
    }
    private MultipartFile planFile;
    private MultipartFile fundingFile;
    private MultipartFile reportFile;
    private MultipartFile deliveryFile;
    private MultipartFile collFile;

    public MultipartFile getModelFile() {
        return ModelFile;
    }

    public void setModelFile(MultipartFile modelFile) {
        ModelFile = modelFile;
    }

    private MultipartFile ModelFile;
    private String planFilePath;
    private String ModelFilePath;
    private String fundingFilePath;
    private String reportFilePath;
    private String deliveryFilePath;
    private String collFilePath;

}
