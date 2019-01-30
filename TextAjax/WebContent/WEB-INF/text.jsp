<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="//code.jquery.com/jquery-2.1.0.min.js"></script>
<script type="text/javascript" src="//jpostal-1006.appspot.com/jquery.jpostal.js"></script>
<title>Text管理</title>
<script type="text/javascript">
    function goPage(pno,psize){
    var itable = document.getElementById("idData");//获取table
    var num = itable.rows.length;//得到记录总数
    var totalPage = 0;
    var pageSize = psize;//一页显示pageSize条记录
    //计算总页数
    if(num/pageSize > parseInt(num/pageSize)){
            totalPage=parseInt(num/pageSize)+1;
       }else{
           totalPage=parseInt(num/pageSize);
       }
     //当前页数
    var currentPage = pno;
    //获取当前页第一条、最后一条记录的行号
    var startRow = (currentPage - 1) * pageSize+1;
       var endRow = currentPage * pageSize;
       endRow = (endRow > num)? num : endRow;
    //修改table中当前页对应的行的属性为显示，非本页的记录为隐藏
    for(var i=1;i<(num+1);i++){
        var irow = itable.rows[i-1];
        if(i>=startRow && i<=endRow){
            irow.style.display = "block";
        }else{
            irow.style.display = "none";
        }
    }

    //分页页码列表
    var tempStr = "共"+num+"条记录 分"+totalPage+"页 当前第"+currentPage+"页";
    if(currentPage>1){
        tempStr += "<a href=\"#\" onClick=\"goPage("+(1)+","+psize+")\">首页</a>";
        tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage-1)+","+psize+")\"><上一页</a>"
    }else{
        tempStr += "首页";
        tempStr += "<上一页";
    }

    if(currentPage<totalPage){
        tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage+1)+","+psize+")\">下一页></a>";
        tempStr += "<a href=\"#\" onClick=\"goPage("+(totalPage)+","+psize+")\">尾页</a>";
    }else{
        tempStr += "下一页>";
        tempStr += "尾页";
    }
    document.getElementById("changePages").innerHTML = tempStr;
}
    </script>
</head>
<body>
<h1 align="center">Text報管理</h1>
	<div id="all_comm" class="all">
		<h2 align="center">Text信息一覧</h2>
	<table  border="4"  align="center">
			<thead>
				<tr align="center">
					<td>ID</td>
					<td>姓名</td>
					<td>性别</td>
					<td>年龄</td>


				</tr>
			</thead>
			<c:forEach items="${texts}" var="admin">
				<tr align="center">
					<td >${admin.id}</td>
					<td >${admin.name}</td>
					<td >${admin.sex}</td>
					<td >${admin.age}</td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>
