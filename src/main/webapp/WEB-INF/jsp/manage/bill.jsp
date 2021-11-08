<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/manage/common/header.jsp" %>
<div class="page-title">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/maps/bill.css">
    <div class="bill-div1">
        <div class="bill-div2">
            <form class="bill-from" action="${pageContext.request.contextPath}/user/all/userlist">
                <table cellpadding="0" align="center">
                    <thead style="color: white"><th>
                    <h2 style="font-size: 30px;">帆船酒店</h2>
                    </th></thead>
                    <tr>
                        <td class="font-color">房间号</td>
                        <td class="font-color">${rid}</td>
                    </tr>
                    <tr>
                        <td class="font-color">入住天数</td>
                        <td class="font-color">${space}</td>
                    </tr>
                    <tr>
                        <td class="font-color">总价</td>
                        <td class="font-color">${price}</td>
                    </tr>
                    <tr>
                        <td class="font-color">退房时间</td>
                        <td class="font-color">${date}</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="返回" style="width: 100px"></td>
                    </tr>
                </table>
            </form>

        </div>
    </div>

</div>
<div class="clearfix"></div>
<%@include file="/WEB-INF/jsp/manage/common/footer.jsp" %>