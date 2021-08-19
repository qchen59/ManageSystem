<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>项目信息</title>
    <link rel="stylesheet" type="text/css" href="../css/app.css" media="all"/>

</head>
<body id="main_body" >

<nav class="menu-container">
    <!-- burger menu -->
    <input type="checkbox" aria-label="Toggle menu" />
    <span></span>
    <span></span>
    <span></span>


    <!-- menu items -->
    <div class="menu">
        <ul>
            <li>
                <a href="${pageContext.request.contextPath}/addProject">
                    添加新项目
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/searchProject">
                    浏览项目
                </a>
            </li>
        </ul>
        <ul>
        </ul>
    </div>
</nav>

<div id="form_container">

    <h1><a>项目信息</a></h1>
    <form id="form_26870" class="appnitro" enctype="multipart/form-data" >
        <div class="form_description">
            <h2>项目信息</h2>
        </div>
        <ul >

            <li id="li_1" >
                <label class="description2">项目名称 </label>
                <div>
                    <p>${selectedProject.pname}</p>
                </div>
            </li>
            <li id="li_2" >
            <label class="description2">总师 </label>
                <div>
                    <p>${selectedProject.architect}</p>
                </div>
        </li>		<li id="li_20" >
            <label class="description2">执行设计所 </label>
            <div>
                <p>${selectedProject.inst}</p>
            </div>
        </li>		<li id="li_3" >
            <label class="description2">项目计划
            </label>
            <div>
                <a href="${pageContext.request.contextPath}/dataDetail/planFile/${selectedProject.id}">
                <input class="button_text" type="button" name="submit" value="数据" />
                </a>
            </div>
        </li>		<li id="li_4" >
            <label class="description2" >协同设计方式
            </label>
            <div>
                <p>${selectedProject.designPlan}</p>
            </div>
        </li>		<li id="li_5" >
            <label class="description2">当前阶段 </label>
            <div>
                <p>${selectedProject.currentStage}</p>
            </div>
        </li>		<li id="li_6" >
            <label class="description2">下一节点 </label>
            <div>
                <p>${selectedProject.nextStage}</p>
            </div>
        </li>		<li id="li_7" >
            <label class="description2">提资记录 </label>
            <div>
                <a href="${pageContext.request.contextPath}/dataDetail/fundingFile/${selectedProject.id}">
                    <input class="button_text" type="button" name="submit" value="数据" />
                </a>
            </div>
        </li>		<li id="li_8" >
            <label class="description2">汇报文件 </label>
            <div>
                <a href="${pageContext.request.contextPath}/dataDetail/reportFile/${selectedProject.id}">
                    <input class="button_text" type="button" name="submit" value="数据" />
                </a>
            </div>
        </li>		<li id="li_9" >
            <label class="description2">发包图 </label>
            <div>
                <a href="${pageContext.request.contextPath}/dataDetail/deliveryFile/${selectedProject.id}">
                    <input class="button_text" type="button" name="submit" value="数据" />
                </a>
            </div>
        </li>		<li id="li_10" >
            <label class="description">总装模型 </label>
            <div>
                <a href="${pageContext.request.contextPath}/dataDetail/modelFile/${selectedProject.id}">
                    <input class="button_text" type="button" name="submit" value="数据" />
                </a>
            </div>
        </li>		<li class="section_break">
            <h2>各专业模型进度</h2>
        </li>		<li id="li_12" >
            <label class="description2" >建筑 </label>
            <div>
                <p>${selectedProject.buildingModel}%</p>
            </div>

        </li>		<li id="li_13" >
            <label class="description2">结构 </label>
            <div>
                <p>${selectedProject.constructionModel}%</p>
            </div>

        </li>		<li id="li_14" >
            <label class="description2" >暖通 </label>
            <div>
                <p>${selectedProject.HVACModel}%</p>
            </div>

        </li>		<li id="li_15" >
            <label class="description2" >给排水 </label>
            <div>
                <p>${selectedProject.waterSDModel}%</p>
            </div>

        </li>		<li id="li_16" >
            <label class="description2" >气动 </label>
            <div>
                <p>${selectedProject.airModel}%</p>
            </div>

        </li>		<li id="li_17" >
            <label class="description2" >电照 </label>
            <div>
                <p>${selectedProject.elModel}%</p>
            </div>

        </li>		<li id="li_18" >
            <label class="description2" >总图 </label>
            <div>
                <p>${selectedProject.generalModel}%</p>
            </div>

        </li>		<li id="li_19" >
            <label class="description2" >碰撞数据 </label>
            <div>
                <a href="${pageContext.request.contextPath}/dataDetail/collFile/${selectedProject.id}">
                    <input class="button_text" type="button" name="submit" value="数据" />
                </a>
            </div>

        </li>
        </ul>
    </form>
</div>

<a href="${pageContext.request.contextPath}/searchProject" class="myButton">返回</a>





</body>
</html>