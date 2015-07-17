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
		<form id="form_1030519" class="appnitro" method="post" action="">
			<div class="form_description">
				<h2>
					Loyola Class
					Search&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
						src="<%=request.getContextPath()%>/loyola_logo.png">
				</h2>
				<p>Search your class according to schedule.</p>
			</div>
			<ul>

				<li id="li_3"><label class="description" for="element_3">Class
						Type </label> <span> <input id="element_3_1" name="element_3"
						class="element radio" type="radio" value="1" /> <label
						class="choice" for="element_3_1">Undergraduate</label> <input
						id="element_3_2" name="element_3" class="element radio"
						type="radio" value="2" /> <label class="choice" for="element_3_2">Graduate</label>

				</span></li>
				<li id="li_4"><label class="description" for="element_4">Department
				</label>
					<div>
						<select class="element select medium" id="element_4"
							name="element_4">
							<option value="" selected="selected"></option>
							<option value="1">ACCOM</option>
							<option value="2">ACCT</option>
							<option value="3">ACHIS</option>
							<option value="4">ACPHI</option>
							<option value="5">ACSTA</option>
							<option value="6">ACTHE</option>
							<option value="7">ACWRI</option>
							<option value="8">AFR</option>
							<option value="9">ANTH</option>
							<option value="10">ARAB</option>
							<option value="11">ASIA</option>
							<option value="12">BEHP</option>
							<option value="13">BHNR</option>
							<option value="14">BICH</option>
							<option value="15">BIET</option>
							<option value="16">BIOI</option>
							<option value="17">BIOL</option>
							<option value="18">BMSC</option>
							<option value="19">BSAD</option>
							<option value="20">CATH</option>
							<option value="21">CHEM</option>
							<option value="22">CHIN</option>
							<option value="23">CHST</option>
							<option value="24">CIEP</option>
							<option value="25">CJC</option>
							<option value="26">CLST</option>
							<option value="27">CMAN</option>
							<option value="28">COMM</option>
							<option value="29">COMP</option>
							<option value="30">CPST</option>
							<option value="31">CPSY</option>
							<option value="32">CRME</option>
							<option value="33">CSIS</option>
							<option value="34">DANC</option>
							<option value="35">DIGH</option>
							<option value="36">DNP</option>
							<option value="37">ECON</option>
							<option value="38">ELPS</option>
							<option value="39">ENGL</option>
							<option value="40">ENGR</option>
							<option value="41">ENTR</option>
							<option value="42">ENVS</option>
							<option value="43">ERIK</option>
							<option value="44">ESL</option>
							<option value="45">ETHC</option>
							<option value="46">EXCM</option>
							<option value="47">EXED</option>
							<option value="48">EXPL</option>
							<option value="49">FINC</option>
							<option value="50">FNAR</option>
							<option value="51">FONU</option>
							<option value="52">FREN</option>
							<option value="53">FRSC</option>
							<option value="54">GERM</option>
							<option value="55">GNUR</option>
							<option value="56">GREK</option>
							<option value="57">GRMS</option>
							<option value="58">HCMT</option>
							<option value="59">HEBR</option>
							<option value="60">HEM</option>
							<option value="61">HIST</option>
							<option value="62">HMSV</option>
							<option value="63">HNDI</option>
							<option value="64">HONR</option>
							<option value="65">HRER</option>
							<option value="66">HSM</option>
							<option value="67">ICB</option>
							<option value="68">IDIM</option>
							<option value="69">INOS</option>
							<option value="70">INFS</option>
							<option value="71">INTS</option>
							<option value="72">IPS</option>
							<option value="73">ISOM</option>
							<option value="74">ITAL</option>
							<option value="75">JAPN</option>
							<option value="76">LATN</option>
							<option value="77">LAW</option>
							<option value="78">LITR</option>
							<option value="79">LREB</option>
							<option value="80">MARK</option>
							<option value="81">MATH</option>
							<option value="82">MBIO</option>
							<option value="83">MCN</option>
							<option value="84">MED</option>
							<option value="85">MGMT</option>
							<option value="86">MIIM</option>
							<option value="87">MLSC</option>
							<option value="88">MPBH</option>
							<option value="89">MPP</option>
							<option value="90">MSN</option>
							<option value="91">MSTU</option>
							<option value="92">NEUR</option>
							<option value="93">NRSC</option>
							<option value="94">OPMG</option>
							<option value="95">PAX</option>
							<option value="96">PHAR</option>
							<option value="97">PHIL</option>
							<option value="98">PHYS</option>
							<option value="99">PIOL</option>
							<option value="100">PLAW</option>
							<option value="101">PLSC</option>
							<option value="102">PLST</option>
							<option value="103">POLS</option>
							<option value="104">PORT</option>
							<option value="105">POST</option>
							<option value="106">PSYC</option>
							<option value="107">RMTD</option>
							<option value="108">ROST</option>
							<option value="109">RUSS</option>
							<option value="110">SOCL</option>
							<option value="111">SOWK</option>
							<option value="112">SPAN</option>
							<option value="113">SPRT</option>
							<option value="114">STAT</option>
							<option value="115">SWFI</option>
							<option value="116">THEO</option>
							<option value="117">THTR</option>
							<option value="118">TLSC</option>
							<option value="119">UCLR</option>
							<option value="120">UCSF</option>
							<option value="121">UNIV</option>
							<option value="122">URB</option>
							<option value="123">VIET</option>
							<option value="124">WSGS</option>

						</select>
					</div></li>
				<li id="li_5"><label class="description" for="element_5">Semester
				</label>
					<div>
						<select class="element select medium" id="element_5"
							name="element_5">
							<option value="" selected="selected"></option>
							<option value="1">Fall</option>
							<option value="2">Summer</option>
							<option value="3">Spring</option>

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
				</span> <span> <select class="element select" style="width: 4em"
						id="element_2_4" name="element_2_4">
							<option value="AM">AM</option>
							<option value="PM">PM</option>
					</select> <label>AM/PM</label>
				</span></li>

				<li class="buttons"><input type="hidden" name="form_id"
					value="1030519" /> <input id="saveForm" class="button_text"
					type="submit" name="submit" value="Search" /></li>
			</ul>
		</form>
	</div>
	<img id="bottom" src="<%=request.getContextPath()%>/Resource/bottom.png" alt="">
</body>
</html>