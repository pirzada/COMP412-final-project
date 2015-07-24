<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
  "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Loyola Class Search</title>
<!--<link rel="stylesheet" type="text/css" href="../Resource/view.css" media="all">-->
<style> <%@include file="/Resource/view.css" %> </style> 
<script> <%@include file="/Resource/view.js" %> </script>
<!--<script type="text/javascript" src="../Resource/view.js"></script>-->

</head>

<body id="main_body">

	<img id="top" src="<%=request.getContextPath()%>/Resource/top.png" alt ="">

	<div id="form_container">

		<h1>
			<a href="https://locus.luc.edu">Locus</a>
		</h1>
		<form id="form_1030519" class="appnitro" method="post" action="result.html">
			<div class="form_description">
				<h2>
					Loyola Class
					Search&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
						src="<%=request.getContextPath()%>/loyola_logo.png">
				</h2>
				<p>Search your class according to schedule.</p>
			</div>
			<ul>

				<li id="li_3"><label class="description" for="element_3">Class Type </label> <span> 
				<input id="element_3_1" name="radio" class="element radio" type="radio" value="1" /> 
				<label class="choice" for="element_3_1">Undergraduate</label> 
				<input id="element_3_2" name="radio" class="element radio" type="radio" value="2" /> 
				<label class="choice" for="element_3_2">Graduate</label>

				</span></li>
				<li id="li_4"><label class="description" for="element_4">Department
				</label>
					<div>
						<select class="element select medium" id="element_4"
							name="department">
							<option value="" selected="selected"></option>
							<option value="ACCOM">ACCOM</option>
							<option value="ACCT">ACCT</option>
							<option value="ACHIS">ACHIS</option>
							<option value="ACPHI">ACPHI</option>
							<option value="ACSTA">ACSTA</option>
							<option value="ACTHE">ACTHE</option>
							<option value="ACWRI">ACWRI</option>
							<option value="AFR">AFR</option>
							<option value="ANTH">ANTH</option>
							<option value="ARAB">ARAB</option>
							<option value="ASIA">ASIA</option>
							<option value="BEHP">BEHP</option>
							<option value="BHNR">BHNR</option>
							<option value="BICH">BICH</option>
							<option value="BIET">BIET</option>
							<option value="BIOI">BIOI</option>
							<option value="BIOL">BIOL</option>
							<option value="BMSC">BMSC</option>
							<option value="BSAD">BSAD</option>
							<option value="CATH">CATH</option>
							<option value="CHEM">CHEM</option>
							<option value="CHIN">CHIN</option>
							<option value="CHST">CHST</option>
							<option value="CIEP">CIEP</option>
							<option value="CJC">CJC</option>
							<option value="CLST">CLST</option>
							<option value="CMAN">CMAN</option>
							<option value="COMM">COMM</option>
							<option value="COMP">COMP</option>
							<option value="CPST">CPST</option>
							<option value="CPSY">CPSY</option>
							<option value="CRME">CRME</option>
							<option value="CSIS">CSIS</option>
							<option value="DANC">DANC</option>
							<option value="DIGH">DIGH</option>
							<option value="DNP">DNP</option>
							<option value="ECON">ECON</option>
							<option value="ELPS">ELPS</option>
							<option value="ENGL">ENGL</option>
							<option value="ENGR">ENGR</option>
							<option value="ENTR">ENTR</option>
							<option value="ENVS">ENVS</option>
							<option value="ERIK">ERIK</option>
							<option value="ESL">ESL</option>
							<option value="ETHC">ETHC</option>
							<option value="EXCM">EXCM</option>
							<option value="EXED">EXED</option>
							<option value="EXPL">EXPL</option>
							<option value="FINC">FINC</option>
							<option value="FNAR">FNAR</option>
							<option value="FONU">FONU</option>
							<option value="FREN">FREN</option>
							<option value="FRSC">FRSC</option>
							<option value="GERM">GERM</option>
							<option value="GNUR">GNUR</option>
							<option value="GREK">GREK</option>
							<option value="GRMS">GRMS</option>
							<option value="HCMT">HCMT</option>
							<option value="HEBR">HEBR</option>
							<option value="HEM">HEM</option>
							<option value="HIST">HIST</option>
							<option value="HMSV">HMSV</option>
							<option value="HNDI">HNDI</option>
							<option value="HONR">HONR</option>
							<option value="HRER">HRER</option>
							<option value="HSM">HSM</option>
							<option value="ICB">ICB</option>
							<option value="IDIM">IDIM</option>
							<option value="INOS">INOS</option>
							<option value="INFS">INFS</option>
							<option value="INTS">INTS</option>
							<option value="IPS">IPS</option>
							<option value="ISOM">ISOM</option>
							<option value="ITAL">ITAL</option>
							<option value="JAPN">JAPN</option>
							<option value="LATN">LATN</option>
							<option value="LAW">LAW</option>
							<option value="LITR">LITR</option>
							<option value="LREB">LREB</option>
							<option value="MARK">MARK</option>
							<option value="MATH">MATH</option>
							<option value="MBIO">MBIO</option>
							<option value="MCN">MCN</option>
							<option value="MED">MED</option>
							<option value="MGMT">MGMT</option>
							<option value="MIIM">MIIM</option>
							<option value="MLSC">MLSC</option>
							<option value="MPBH">MPBH</option>
							<option value="MPP">MPP</option>
							<option value="MSN">MSN</option>
							<option value="MSTU">MSTU</option>
							<option value="NEUR">NEUR</option>
							<option value="NRSC">NRSC</option>
							<option value="OPMG">OPMG</option>
							<option value="PAX">PAX</option>
							<option value="PHAR">PHAR</option>
							<option value="PHIL">PHIL</option>
							<option value="PHYS">PHYS</option>
							<option value="PIOL">PIOL</option>
							<option value="PLAW">PLAW</option>
							<option value="PLSC">PLSC</option>
							<option value="PLST">PLST</option>
							<option value="POLS">POLS</option>
							<option value="PORT">PORT</option>
							<option value="POST">POST</option>
							<option value="PSYC">PSYC</option>
							<option value="RMTD">RMTD</option>
							<option value="ROST">ROST</option>
							<option value="RUSS">RUSS</option>
							<option value="SOCL">SOCL</option>
							<option value="SOWK">SOWK</option>
							<option value="SPAN">SPAN</option>
							<option value="SPRT">SPRT</option>
							<option value="STAT">STAT</option>
							<option value="SWFI">SWFI</option>
							<option value="THEO">THEO</option>
							<option value="THTR">THTR</option>
							<option value="TLSC">TLSC</option>
							<option value="UCLR">UCLR</option>
							<option value="UCSF">UCSF</option>
							<option value="UNIV">UNIV</option>
							<option value="URB">URB</option>
							<option value="VIET">VIET</option>
							<option value="WSGS">WSGS</option>

						</select>
					</div></li>
				<li id="li_5"><label class="description" for="element_5">Semester
				</label>
					<div>
						<select class="element select medium" id="element_5"
							name="element_5">
							<option value="" selected="selected"></option>
							<option value="1">Fall 2015</option>
							<!--<option value="2">Summer</option>
							<option value="3">Spring</option>-->

						</select>
					</div></li>
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

				<li class="buttons"><input type="hidden" name="form_id"
					value="1030519" /> <input id="saveForm" class="button_text"
					type="submit" name="submit" value="Search" /></li>
			</ul>
		</form>
	</div>
	<img id="bottom" src="<%=request.getContextPath()%>/Resource/bottom.png" alt="">
</body>
</html>