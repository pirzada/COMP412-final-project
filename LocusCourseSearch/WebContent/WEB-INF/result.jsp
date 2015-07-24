<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Loyola Class Result</title>
<!--<link rel="stylesheet" type="text/css" href="../Resource/view.css" media="all">-->
<style> <%@include file="/Resource/view.css" %> </style> 
<script> <%@include file="/Resource/view.js" %> </script>
<!--<script type="text/javascript" src="../Resource/view.js"></script>-->
</head>
<body>
	<img id="top" src="<%=request.getContextPath()%>/Resource/top.png" alt ="">

	<div id="form_container">

		<h1>
			<a href="https://locus.luc.edu">Locus</a>
		</h1>
		<form:form id="form_1030519" class="appnitro" method="post" action="fullResult.htm" modelAttribute="finallist">
			<div class="form_description">
				<h2>
					Loyola Class
					Result
				</h2>
				<p>Expanded Result.</p>
			</div>
			<ul>

				<li class = "tables"><table border = "1">
				<tr><th>Cluster Number</th><th>Number of CLasses</th><th>Start Time</th><th>End time</th><th>Campus</th>
				</tr>
					<c:forEach items="${result}" var="finalResult">
							<tr>
								<td><button type="submit" id ="cluster" name = "cluster" value = ${finalResult.getCluster()}>${finalResult.getCluster()}</button></td>
								<td>${finalResult.getNumberOfClasses()}</td>
								<td>${finalResult.getStartTime()}</td>
								<td>${finalResult.getEndTime()}</td>
								<td>${finalResult.getCampus()}</td>
							</tr>
						</c:forEach>
				</table>
				</li>

				<li class="buttons"><input type="hidden" name="form_id"
					value="1030519" />  <input 
					type="hidden" name="department" value="${department}" /><input 
					type="hidden" name="radio" value="${classType}" /></li>
			</ul>
		</form:form>
	</div>
	<img id="bottom" src="<%=request.getContextPath()%>/Resource/bottom.png" alt="">

</body>
</html>