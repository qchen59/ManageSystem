package cn.managesystem.entity;


import java.util.ArrayList;
import java.util.List;

public class Project{
    public enum Institute{
        设计一所, 设计二所;
    }
    private int id;
    private String pname;
    private String architect;
    private String inst;
    private String designPlan;
    private String currentStage;
    private String nextStage;
    private int buildingModel;
    private int constructionModel;
    private int HVACModel;
    private int waterSDModel;
    private int airModel;
    private int elModel;
    private int generalModel;


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    private String createTime;
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        if (inst == "1") {
            this.inst = "设计一所";
        }
        this.inst = inst;
    }


    public String getDesignPlan() {
        return designPlan;
    }

    public void setDesignPlan(String designPlan) {
        this.designPlan = designPlan;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public String getNextStage() {
        return nextStage;
    }

    public void setNextStage(String nextStage) {
        this.nextStage = nextStage;
    }


    public int getBuildingModel() {
        return buildingModel;
    }

    public void setBuildingModel(int buildingModel) {
        this.buildingModel = buildingModel;
    }

    public int getConstructionModel() {
        return constructionModel;
    }

    public void setConstructionModel(int constructionModel) {
        this.constructionModel = constructionModel;
    }

    public int getHVACModel() {
        return HVACModel;
    }

    public void setHVACModel(int HVACModel) {
        this.HVACModel = HVACModel;
    }

    public int getWaterSDModel() {
        return waterSDModel;
    }

    public void setWaterSDModel(int waterSDModel) {
        this.waterSDModel = waterSDModel;
    }

    public int getAirModel() {
        return airModel;
    }

    public void setAirModel(int airModel) {
        this.airModel = airModel;
    }

    public int getElModel() {
        return elModel;
    }

    public void setElModel(int elModel) {
        this.elModel = elModel;
    }

    public int getGeneralModel() {
        return generalModel;
    }

    public void setGeneralModel(int generalModel) {
        this.generalModel = generalModel;
    }

    public void updateProject (Project nProject) {
        this.designPlan = nProject.getDesignPlan();
        this.architect = nProject.getArchitect();
        this.pname = nProject.getPname();
        this.airModel = nProject.getAirModel();
        this.buildingModel = nProject.getBuildingModel();
        this.constructionModel = nProject.getConstructionModel();
        this.waterSDModel = nProject.getWaterSDModel();
        this.currentStage = nProject.getCurrentStage();
        this.elModel = nProject.getElModel();
        this.generalModel = nProject.getGeneralModel();
        this.HVACModel = nProject.getHVACModel();
        this.inst = nProject.getInst();
        this.nextStage = nProject.getNextStage();
        this.createTime = nProject.getCreateTime();
        this.updateTime = nProject.getUpdateTime();

    }

    public String toString() {
        String str = "新增项目：" + pname + " " + "设计师： " + architect + " " + "设计所： " + inst
        + " " + "设计方式" + designPlan;

        return str;
    }

}
