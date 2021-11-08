<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>可预定房间</title>

<style type="text/css">
    body{
        background:url("../../../statics/images/9.jpg") ;
    }
    table{
        background-color: yellow;
    }

    td{
        text-align: center;
        width: 200px;
        height: 60px;
    }

</style>
</head>
<body>
<link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/book.css">
<h2 align="center">帆船酒店</h2>
<div align="center" id="top">
    <table align="center" border="1" cellspacing="0">
        <thead>
        <th class="font-color">房间号</th>
        <th class="font-color">楼层</th>
        <th class="font-color">房间类型</th>
        <th class="font-color">单价</th>
        <th class="font-color">操作</th>
        </thead>
        <c:forEach items="${rooms}" var="rooms" >
            <tr>
                <td class="font-color">${rooms.rid}</td>
                <td class="font-color">${rooms.floor}</td>
                <td class="font-color">${rooms.rname}</td>
                <td class="font-color">${rooms.price}</td>
                <td class="font-color"> <a style="text-decoration: none;color: red" href="${pageContext.request.contextPath}/user/all/userInterface?rid=${rooms.rid}">预定</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>