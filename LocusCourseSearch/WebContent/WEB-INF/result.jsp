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
				<li id="li_6"><label class="description" for="element_6">Week
						Day </label>
					<div>
						<select class="element select medium" id="element_6"
							name="element_6">
							<option value="" selected="selected"></option>
							<option value="1">Monday</option>
							<option value="2">Tuesday</option>
							<option value="3">Wednesday</option>
							<option value="4">Thursday</option>
							<option value="5">Friday</option>
							<option value="6">Saturday</option>
							<option value="7">Sunday</option>

						</select>
					</div></li>
				<li id="li_1"><label class="description" for="element_1">Start
						Time </label> <span> <input id="element_1_1" name="element_1_1"
						class="element text " size="2" type="text" maxlength="2" value="" />
						: <label>HH</label>
				</span> <span> <input id="element_1_2" name="element_1_2"
						class="element text " size="2" type="text" maxlength="2" value="" />
						: <label>MM</label>
				</span> <span> <select class="element select" style="width: 4em"
						id="element_1_4" name="element_1_4">
							<option value="AM">AM</option>
							<option value="PM">PM</option>
					</select> <label>AM/PM</label>
				</span></li>
				<li id="li_2"><label class="description" for="element_2">End
						Time </label> <span> <input id="element_2_1" name="element_2_1"
						class="element text " size="2" type="text" maxlength="2" value="" />
						: <label>HH</label>
				</span> <span> <input id="element_2_2" name="element_2_2"
						class="element text " size="2" type="text" maxlength="2" value="" />
						: <label>MM</label>
				 </span><span></span><select class="element select" style="width: 4em"
						id="element_2_4" name="element_2_4">
							<option value="AM">AM</option>
							<option value="PM">PM</option>
					</select> <label>AM/PM</label>
				</span></li>
				<li class = "tables"><table border = "1">
				<tr><th>Semester</th><th>Day</th><th>Classes</th><th>Start time</th><th>End Time</th>
				</tr>
				<tr></tr><tr></tr>
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