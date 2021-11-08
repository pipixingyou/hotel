<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@include file="/WEB-INF/jsp/user/common/header.jsp" %>--%>
<body>
<div class="page-title">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/book.css">
    <div class="bill-div1">
            <form class="bill-from" action="${pageContext.request.contextPath}/manager/backend/app/bookroom">
                <table cellpadding="0" align="center">
                    <thead style="color: white"><th>
                        <h2 style="font-size: 30px;">帆船酒店</h2>
                    </th></thead>
                    <tr>
                        <td class="font-color">房间号</td>
                        <td><input type="text" value="${rid}" readonly name="rid"><br></td>
                    </tr>
                    <tr>
                        <td class="font-color">姓名</td>
                        <td><input type="text" name="uname"></td>
                    </tr>
                    <tr>
                        <td class="font-color">身份证号</td>
                        <td><input type="text" name="idcard"></td>
                    </tr>
                    <tr>
                        <td class="font-color">电话</td>
                        <td><input type="text" name="uphone"></td>
                    </tr>
                    <tr>
                        <td class="font-color">性别</td>
                        <td><input type="text" name="usex"></td>
                    </tr>
                    <tr>
                        <td class="font-color">入住时间</td>
                        <td><input type="date" name="fromtime"></td>
                    </tr>
                    <tr>
                        <td colspan="1"><input type="submit" value="确定" style="width: 100px"></td>
                        <td><a href="${pageContext.request.contextPath}/manager/backend/app/lookRoom" style="text-decoration: none;color: greenyellow">返回</a></td>
                    </tr>
                </table>
            </form>
    </div>

</div>
<div class="clearfix"></div>
</body>