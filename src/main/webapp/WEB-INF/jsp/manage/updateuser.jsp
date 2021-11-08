<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
      <div class="x_title">
        <h2>修改客户基础信息 <i class="fa fa-user"></i><small></small></h2>
             <div class="clearfix"></div>
      </div>
      <div class="x_content">
           <div class="clearfix"></div>
<%--        method="post"--%>
        <form class="form-horizontal form-label-left" action="updateUser"  enctype="multipart/form-data">
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwareName">客户名称 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="softwareName" class="form-control col-md-7 col-xs-12" 
               data-validate-length-range="20" data-validate-words="1" name="uname"  required="required"
               placeholder="请输入姓名" type="text" value="${user.uname}">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="APKName">身份证号 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="APKName" class="form-control col-md-7 col-xs-12" 
              	data-validate-length-range="20" data-validate-words="1" name="idcard"   required="required"
              	placeholder="请输入身份证号" type="text" value="${user.idcard}">
            </div>
          </div>
          
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="supportROM">客户电话 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="supportROM" class="form-control col-md-7 col-xs-12" name="uphone"
              	data-validate-length-range="20" data-validate-words="1"   required="required"
              	placeholder="请输入电话" type="text" value="${user.uphone}">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="interfaceLanguage">性别 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input id="interfaceLanguage" class="form-control col-md-7 col-xs-12" 
              data-validate-length-range="20" data-validate-words="1" name="usex"   required="required"
              placeholder="请输入性别" type="text" value="${user.usex}">
            </div>
          </div>
          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="downloads">房间号 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" id="downloads" name="rid"   required="required"
              data-validate-minmax="10,500"  class="form-control col-md-7 col-xs-12" value="${user.rid}">
            </div>
          </div>
          
<%--          <div class="item form-group">--%>
<%--            <label class="control-label col-md-3 col-sm-3 col-xs-12"  for="flatformId">所属平台 <span class="required">*</span></label>--%>
<%--            <div class="col-md-6 col-sm-6 col-xs-12">--%>
<%--              <select name="flatformId" id="flatformId" class="form-control"   required="required"></select>--%>
<%--            </div>--%>
<%--          </div>--%>
          <div class="item form-group">
<%--            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="uid">房间号 <span class="required">*</span>--%>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="hidden" id="uid" name="uid"   required="required"
                     data-validate-minmax="10,500"  class="form-control col-md-7 col-xs-12" value="${user.uid}">
            </div>
          </div>

          <div class="ln_solid"></div>
          <div class="form-group">
            <div class="col-md-6 col-md-offset-3">
              <button id="send" type="submit" class="btn btn-success">保存</button>
              <button type="button" class="btn btn-primary" id="back" onclick="history.go(-1)">返回</button>
              <br/><br/>
            </div>
          </div>
          <input type="hidden" value="${param.typeid}" name="typeid">
        </form>
      </div>
    </div>
  </div>
</div>
<%@include file="common/footer.jsp"%>
<%--<script src="${pageContext.request.contextPath }/statics/localjs/appinfoadd.js"></script>--%>