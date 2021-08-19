package cn.managesystem.dao;

import cn.managesystem.entity.FileData;
import cn.managesystem.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileDataDao {
    void saveFileData(FileData fileData);
    List<FileData> getFileData(@Param("projectId")int projectId, @Param("fileType")String fileType);
    FileData getFileDataById(@Param("id")int id);
}
