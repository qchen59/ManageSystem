

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>添加新项目</title>
    <link rel="stylesheet" type="text/css" href="css/app.css" media="all"/>
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

    <h1><a>添加新项目</a></h1>
    <form id="form_26870" class="appnitro" action="${pageContext.request.contextPath}/addNewProject" method="post" enctype=multipart/form-data>
        <div class="form_description">
            <h2>添加新项目</h2>
            <p>请填写项目信息，上传相关文件。</p>
        </div>
        <ul >

            <li id="li_1" >
                <label class="description" for="element_1">项目名称 </label>
                <div>
                    <input path="pname" id="element_1" name="pname" class="element text medium" type="text" maxlength="255" value=""/>
                </div>
            </li>		<li id="li_2" >
            <label class="description" for="element_2">总师 </label>
            <div>
                <input path="architect" id="element_2" name="architect" class="element text medium" type="text" maxlength="255" value=""/>
            </div>
        </li>
            <li id="li_20" >
                <label class="description" for="element_20">执行设计所 </label>
                <div>
                    <select class="element select medium" id="element_20" path="inst" name="inst">
                        <option value="" selected="selected"></option>
                        <option value="设计一所" >设计一所</option>
                        <option value="设计二所" >设计二所</option>

                    </select>
                </div>
            </li>		<li id="li_3" >
            <label class="description" for="element_3">项目计划
            </label>
            <div>
                <input id="element_3" name="planFile" path="planFile" class="element file" type="file"/>
            </div>
        </li>		<li id="li_4" >
            <label class="description" for="element_4">协同设计方式
            </label>
            <div>
                <input id="element_4" name="designPlan" path ="designPlan" class="element text medium" type="text" maxlength="255" value=""/>
            </div>
        </li>		<li id="li_5" >
            <label class="description" for="element_5">当前阶段 </label>
            <div>
                <select class="element select medium" id="element_5" path="currentStage" name="currentStage">
                    <option value="" selected="selected"></option>
                    <option value="方案设计" >方案设计</option>
                    <option value="初步设计" >初步设计</option>
                    <option value="施工图设计" >施工图设计</option>

                </select>
            </div>
        </li>		<li id="li_6" >
            <label class="description" for="element_6">下一节点 </label>
            <div>
                <input id="element_6" path="nextStage" name="nextStage" class="element text medium" type="date" min="2010-01-01" max="2030-12-31" value=""/>
            </div>
        </li>		<li id="li_7" >
            <label class="description" for="element_7">提资记录 </label>
            <div>
                <input id="element_7" name="fundingFile" path="fundingFile" class="element file" type="file"/>
            </div>
        </li>		<li id="li_8" >
            <label class="description" for="element_8">汇报文件 </label>
            <div>
                <input id="element_8" path="reportFile" name="reportFile" class="element file" type="file"/>
            </div>
        </li>		<li id="li_9" >
            <label class="description" for="element_9">发包图 </label>
            <div>
                <input id="element_9" path="deliveryFile" name="deliveryFile" class="element file" type="file"/>
            </div>
        </li>		<li id="li_10" >
            <label class="description" for="element_10">总装模型 </label>
            <div>
                <input id="element_10" path="modelFile" name="modelFile" class="element file" type="file"/>
            </div>
        </li>		<li class="section_break">
            <h3>各专业模型进度</h3>
            <p>请按进度百分比输入整数。
                输入格式：50</p>
        </li>		<li id="li_12" >
            <label class="description" for="element_12">建筑 </label>
            <div>
                <input id="element_12" path="buildingModel" name="buildingModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_13" >
            <label class="description" for="element_13">结构 </label>
            <div>
                <input id="element_13" path="constructionModel" name="constructionModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_14" >
            <label class="description" for="element_14">暖通 </label>
            <div>
                <input id="element_14" path="HVACModel" name="HVACModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_15" >
            <label class="description" for="element_15">给排水 </label>
            <div>
                <input id="element_15" path="waterSDModel" name="waterSDModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_16" >
            <label class="description" for="element_16">气动 </label>
            <div>
                <input id="element_16" path="airModel" name="airModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_17" >
            <label class="description" for="element_17">电照 </label>
            <div>
                <input id="element_17" path="elModel" name="elModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_18" >
            <label class="description" for="element_18">总图 </label>
            <div>
                <input id="element_18" path="generalModel"  name="generalModel" class="element text medium" type="text" maxlength="255" value=""/>
                <lable class="after">%</lable>
            </div>
        </li>		<li id="li_19" >
            <label class="description" for="element_19">碰撞数据 </label>
            <div>
                <input id="element_19" path="collFile" name="collFile" class="element file" type="file"/>
            </div>
        </li>




            <li class="buttons">

                    <input id="saveForm" class="button_text" type="submit" name="submit" value="添加"/>

            </li>
        </ul>
    </form>
</div>
</body>
</html>