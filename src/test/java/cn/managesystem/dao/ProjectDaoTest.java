package cn.managesystem.dao;

import static org.junit.Assert.*;

import cn.managesystem.entity.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ProjectDaoTest {

    @Autowired
    private ProjectDao projectDao;

    @Test
    public void testFindProjectById() {
        int id = 1;
        Project project = projectDao.findProjectById(id);
        assertEquals(1,project.getId());
        assertEquals("长江存储",project.getPname());
    }
}