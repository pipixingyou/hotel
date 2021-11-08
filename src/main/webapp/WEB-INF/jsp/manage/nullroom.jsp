<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<div class="clearfix"></div>
<div class="row">
	<div class="col-md-12">
		<div class="x_panel">
			<div class="x_title">
				<h2>
					酒店 信息管理维护 <i class="fa fa-user"></i><small>
						- 您可以通过搜索或者其他的筛选项对酒店的信息进行修改、删除等管理操作。^_^</small>
				</h2>
				<h2 style="color: red">&nbsp;&nbsp;&nbsp;剩余空房数量:${count}</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<form action="list" id="myForm">
<%--					<input type="hidden" name="pageIndex" value="1" />--%>
						<input type="hidden" name="pageNum" value="${params.pageNum}" id="currentPage"/>
			    <ul>
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">楼层</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
								<input name="floor" type="text" class="form-control col-md-7 col-xs-12" value="${params.floor }">
							</div>
						</div>
					</li>
					
					<li>
						<div class="form-group">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">房间类型</label>
							<div class="col-md-6 col-sm-6 col-xs-12">
<%--								<select name="queryStatus" class="form-control">
									<c:if test="${statusList != null }">
									   <option value="">--请选择--</option>
									   <c:forEach var="rooms" items="${rooms}">
									   		<option <c:if test="${rooms.typeid == rooms }">selected="selected"</c:if>
									   		value="${dataDictionary.valueId}">${dataDictionary.valueName}</option>
									   </c:forEach>
									</c:if>
        						</select>--%>
	<input name="rname" type="text" class="form-control col-md-7 col-xs-12" value="${params.rname }">
							</div>
						</div>
					</li>
<%--					<li>--%>
<%--						<div class="form-group">--%>
<%--							<label class="control-label col-md-3 col-sm-3 col-xs-12">所属平台</label>--%>
<%--							<div class="col-md-6 col-sm-6 col-xs-12">--%>
<%--								<select name="queryFlatformId" class="form-control">--%>
<%--									<c:if test="${flatFormList != null }">--%>
<%--									   <option value="">--请选择--</option>--%>
<%--									   <c:forEach var="dataDictionary" items="${flatFormList}">--%>
<%--									   		<option <c:if test="${dataDictionary.valueId == queryFlatformId }">selected="selected"</c:if>--%>
<%--									   		value="${dataDictionary.valueId}">${dataDictionary.valueName}</option>--%>
<%--									   </c:forEach>--%>
<%--									</c:if>--%>
<%--        						</select>--%>
<%--							</div>--%>
<%--						</div>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<div class="form-group">--%>
<%--							<label class="control-label col-md-3 col-sm-3 col-xs-12">一级分类</label>--%>
<%--							<div class="col-md-6 col-sm-6 col-xs-12">--%>
<%--								<select id="queryCategoryLevel1" name="queryCategoryLevel1" class="form-control">--%>
<%--									<c:if test="${categoryLevel1List != null }">--%>
<%--									   <option value="">--请选择--</option>--%>
<%--									   <c:forEach var="appCategory" items="${categoryLevel1List}">--%>
<%--									   		<option <c:if test="${appCategory.id == queryCategoryLevel1 }">selected="selected"</c:if>--%>
<%--									   		value="${appCategory.id}">${appCategory.categoryName}</option>--%>
<%--									   </c:forEach>--%>
<%--									</c:if>--%>
<%--        						</select>--%>
<%--							</div>--%>
<%--						</div>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<div class="form-group">--%>
<%--							<label class="control-label col-md-3 col-sm-3 col-xs-12">二级分类</label>--%>
<%--							<div class="col-md-6 col-sm-6 col-xs-12">--%>
<%--							<input type="hidden" name="categorylevel2list" id="categorylevel2list"/>--%>
<%--        						<select name="queryCategoryLevel2" id="queryCategoryLevel2" class="form-control">--%>
<%--        							<c:if test="${categoryLevel2List != null }">--%>
<%--									   <option value="">--请选择--</option>--%>
<%--									   <c:forEach var="appCategory" items="${categoryLevel2List}">--%>
<%--									   		<option <c:if test="${appCategory.id == queryCategoryLevel2 }">selected="selected"</c:if>--%>
<%--									   		value="${appCategory.id}">${appCategory.categoryName}</option>--%>
<%--									   </c:forEach>--%>
<%--									</c:if>--%>
<%--        						</select>--%>
<%--							</div>--%>
<%--						</div>--%>
<%--					</li>--%>
<%--					<li>--%>
<%--						<div class="form-group">--%>
<%--							<label class="control-label col-md-3 col-sm-3 col-xs-12">三级分类</label>--%>
<%--							<div class="col-md-6 col-sm-6 col-xs-12">--%>
<%--        						<select name="queryCategoryLevel3" id="queryCategoryLevel3" class="form-control">--%>
<%--        							<c:if test="${categoryLevel3List != null }">--%>
<%--									   <option value="">--请选择--</option>--%>
<%--									   <c:forEach var="appCategory" items="${categoryLevel3List}">--%>
<%--									   		<option <c:if test="${appCategory.id == queryCategoryLevel3 }">selected="selected"</c:if>--%>
<%--									   		value="${appCategory.id}">${appCategory.categoryName}</option>--%>
<%--									   </c:forEach>--%>
<%--									</c:if>--%>
<%--        						</select>--%>
<%--							</div>--%>
<%--						</div>--%>
<%--					</li>--%>
					<li><button type="submit" class="btn btn-primary"> 查 &nbsp;&nbsp;&nbsp;&nbsp;询 </button></li>
				</ul>
			</form>
		</div>
	</div>
</div>
<div class="col-md-12 col-sm-12 col-xs-12">
	<div class="x_panel">
		<div class="x_content">
			<p class="text-muted font-13 m-b-30"></p>
			<div id="datatable-responsive_wrapper"
				class="dataTables_wrapper form-inline dt-bootstrap no-footer">
				<div class="row">
					<div class="col-sm-12">
<%--					<a href="${pageContext.request.contextPath}/dev/flatform/app/appinfoadd" class="btn btn-success btn-sm">新增APP基础信息</a>--%>
						<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
							cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="First name: activate to sort column descending"
										aria-sort="ascending">房间号</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										楼层</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										房间状态</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										房间类型</th>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										aria-label="Last name: activate to sort column ascending">
										房间价格</th>
<%--									<th class="sorting" tabindex="0"--%>
<%--										aria-controls="datatable-responsive" rowspan="1" colspan="1"--%>
<%--										aria-label="Last name: activate to sort column ascending">--%>
<%--										状态</th>--%>
<%--									<th class="sorting" tabindex="0"--%>
<%--										aria-controls="datatable-responsive" rowspan="1" colspan="1"--%>
<%--										aria-label="Last name: activate to sort column ascending">--%>
<%--										下载次数</th>--%>
<%--									<th class="sorting" tabindex="0"--%>
<%--										aria-controls="datatable-responsive" rowspan="1" colspan="1"--%>
<%--										aria-label="Last name: activate to sort column ascending">--%>
<%--										最新版本号</th>--%>
									<th class="sorting" tabindex="0"
										aria-controls="datatable-responsive" rowspan="1" colspan="1"
										style="width: 124px;"
										aria-label="Last name: activate to sort column ascending">
										操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="rooms" items="${pageInfo.list }" varStatus="status">
									<tr role="row" class="odd">
										<td tabindex="0" class="sorting_1">${rooms.rid}</td>
										<td>${rooms.floor }</td>
										<td>空房</td>
										<td>${rooms.rname }</td>
										<td>${rooms.price }</td>
<%--										<td><span id="appInfoStatus${appInfo.id}">${appInfo.statusName }</span></td>--%>
<%--										<td>${appInfo.downloads }</td>--%>
<%--										<td>${appInfo.versionNo }</td>--%>
										<td>
										<div class="btn-group">
                      <button type="button" class="btn btn-danger">点击操作</button>
                      <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <span class="caret"></span>
                        <span class="sr-only">Toggle Dropdown</span>
                      </button>
                      <ul class="dropdown-menu" role="menu">
                        <li>
                        	<c:choose>
											<c:when test="${appInfo.status == 2 || appInfo.status == 5}">
												<a class="saleSwichOpen" saleSwitch="open" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwareName } data-toggle="tooltip" data-placement="top" title="" data-original-title="恭喜您，您的审核已经通过，您可以点击上架发布您的APP">上架</a>
											</c:when>
											<c:when test="${appInfo.status == 4}">
												<a class="saleSwichClose" saleSwitch="close" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwareName } data-toggle="tooltip" data-placement="top" title="" data-original-title="您可以点击下架来停止发布您的APP，市场将不提供APP的下载">下架</a>
											</c:when>
										</c:choose>
                        </li>
                        <li><a class="addVersion" href="appinfoadd?rid=${rooms.rid}&typeid=${rooms.typeid}" data-toggle="tooltip" data-placement="top" title="" data-original-title="添加客户">订房</a>
                        </li>
                        <li><a data-toggle="tooltip" href="goodRoom?rid=${rooms.rid}&typeid=${rooms.typeid}" data-placement="top" title="" data-original-title="房间维修">维修</a>
                        </li>
<%--                        <li><a  class="modifyAppInfo"
											appinfoid="${appInfo.id }" status="${appInfo.status }" statusname="${appInfo.statusName }"
											data-toggle="tooltip" data-placement="top" title="" data-original-title="修改APP基础信息">修改</a></li>
                        <li><a  class="viewApp" appinfoid=${appInfo.id }  data-toggle="tooltip" data-placement="top" title="" data-original-title="查看APP基础信息以及全部版本信息">查看</a></li>
						<li><a  class="deleteApp" appinfoid=${appInfo.id }  appsoftwarename=${appInfo.softwareName } data-toggle="tooltip" data-placement="top" title="" data-original-title="删除APP基础信息以及全部版本信息">删除</a></li>--%>
                      </ul>
                    </div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-5">
						<div class="dataTables_info" id="datatable-responsive_info"
							role="status" aria-live="polite">共${pageInfo.total }条记录
							${pageInfo.pageNum }/${pageInfo.pages }页</div>
					</div>
					<div class="col-sm-7">
						<div class="dataTables_paginate paging_simple_numbers"
							id="datatable-responsive_paginate">
							<ul class="pagination">
									<li class="paginate_button previous"><a
										href="javascript:toPage(${pageInfo.navigateFirstPage});"
										aria-controls="datatable-responsive" data-dt-idx="0"
										tabindex="0">首页</a>
									</li>
									<li class="paginate_button "><a
										href="javascript:toPage(${pageInfo.prePage});"
										aria-controls="datatable-responsive" data-dt-idx="1"
										tabindex="0">上一页</a>
									</li>
									<li class="paginate_button "><a
										href="javascript:toPage(${pageInfo.nextPage});"
										aria-controls="datatable-responsive" data-dt-idx="1"
										tabindex="0">下一页</a>
									</li>
									<li class="paginate_button next"><a
										href="javascript:toPage(${pageInfo.navigateLastPage});"
										aria-controls="datatable-responsive" data-dt-idx="7"
										tabindex="0">尾页</a>
									</li>
							</ul>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>
</div>
<%@include file="common/footer.jsp"%>
<script type="text/javascript">
	function toPage(pageNum) {
			var currentPage = document.getElementById("currentPage");
			currentPage.value = pageNum;

			var myForm = document.getElementById("myForm");
			myForm.submit();
	}

</script>
<script src="${pageContext.request.contextPath }/statics/localjs/rollpage.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/appinfolist.js"></script>