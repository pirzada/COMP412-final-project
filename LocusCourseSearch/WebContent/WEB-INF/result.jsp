<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<form id="form_1030519" class="appnitro" method="post" action="">
			<div class="form_description">
				<h2>
					Loyola Class
					Result&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
						src="<%=request.getContextPath()%>/loyola_logo.png">
				</h2>
				<p>Search your class according to schedule.</p>
			</div>
			<ul>

				<li class = "tables"><table border = "1">
				<tr><th>Cluster Number</th><th>Number of CLasses</th><th>Start Time</th><th>End time</th><th>Campus</th>
				</tr>
					<c:forEach items="${result}" var="finalResult">
							<tr>
								<td>${finalResult.getCluster()}</td>
								<td>${finalResult.getNumberOfClasses()}</td>
								<td>${finalResult.getStartTime()}</td>
								<td>${finalResult.getEndTime()}</td>
								<td>${finalResult.getCampus()}</td>
							</tr>
						</c:forEach>
				</table>
				</li>

				<li class="buttons"><input type="hidden" name="form_id"
					value="1030519" /> <input id="saveForm" class="button_text"
					type="submit" name="submit" value="Done" /></li>
			</ul>
		</form>
	</div>
	<img id="bottom" src="<%=request.getContextPath()%>/Resource/bottom.png" alt="">

</body>
</html>