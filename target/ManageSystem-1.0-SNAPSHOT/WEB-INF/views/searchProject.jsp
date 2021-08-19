<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>项目浏览</title>
    <link rel="stylesheet" type="text/css" href="css/app.css"/>

</head>
<body id="main_body" >
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
    function searchFunction() {
        // Declare variables
        var input, filter, table, tr, td, i, txtValue;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");

        // Loop through all table rows, and hide those who don't match the search query
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[1];
            if (td) {
                txtValue = td.textContent || td.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
</script>

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

<div id="table_container" style="overflow:scroll;">
    <h1></h1>
        <input type="text" class="myInput"  id="myInput" onkeyup="searchFunction()" placeholder="输入项目名称"/>
    <table class="myTable" id="myTable">
        <tr class="header">
            <th>设计所名称</th>
            <th>项目名称</th>
            <th>总师</th>
            <th>协同设计方式</th>
            <th>当前阶段</th>
            <th>创建时间</th>
            <th>最后更新时间</th>
            <th>操作</th>
        </tr>
        <c:forEach var="project" items="${projectList}">
        <tr>
            <td>${project.inst}</td>
            <td>${project.pname}</td>
            <td>${project.architect}</td>
            <td>${project.designPlan}</td>
            <td>${project.currentStage}</td>
            <td>${project.createTime}</td>
            <td>${project.updateTime}</td>
            <th>
                <a href="${pageContext.request.contextPath}/projectDetail/${project.id}">
                <input class="button_text" type="button" value="详情" id="detailId"/>
                </a>
                <a href="${pageContext.request.contextPath}/editProject/${project.id}">
                <input class="button_text" type="button" value="更新" id="editId"/>
                </a>
            </th>
        </tr>
        </c:forEach>
    </table>

</div>




</body>
</html>