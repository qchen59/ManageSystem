<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>项目数据</title>
    <link rel="stylesheet" type="text/css" href="../../css/app.css" media="all"/>

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

<div id="table_container">
    <h1></h1>
    <input type="text" class="myInput"  placeholder="输入文件名称"/>
    <table class="myTable">
        <tr class="header">
            <th>文件名称</th>
            <th>上传时间</th>
            <th>查看</th>
        </tr>
        <c:forEach var="file" items="${fileList}">
        <tr>
            <td>${file.fileName}</td>
            <td>${file.uploadTime}</td>
            <td><a href="${pageContext.request.contextPath}/down/${file.id}"><input class="button_text" type="button" name="submit" value="查看文件" /></a></td>
        </tr>
        </c:forEach>
    </table>

</div>


<a href="${pageContext.request.contextPath}/projectDetail/${projectID}" class="myButton">返回</a>




</body>
</html>