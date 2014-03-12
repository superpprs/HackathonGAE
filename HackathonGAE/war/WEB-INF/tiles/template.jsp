<!DOCTYPE HTML>
<!-- This is used to create the template for the application using Apache tiles -->

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link
	href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,300italic,600|Source+Code+Pro"
	rel="stylesheet" />
<link
	href="http://www.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css"
	rel="stylesheet" />
<link href="style/leftMenu.css"	rel="stylesheet" />
<!--[if lte IE 8]><script src="js/html5shiv.js" type="text/javascript"></script><![endif]-->
<script src="script/jquery-1.10.1.min.js"></script>
<script src="script/config.js"></script>
<script src="script/skel.min.js"></script>
<script src="script/skel-panels.min.js"></script>
<script src="script/Main.js"></script>
</head>
<body onload="setStyle()">
	<div class="container">
		<!-- Header -->
		<div id="header">
			<h1 id="title">
				<tiles:insertAttribute name="title" ignore="true" />
			</h1>
		</div>
		<!-- Hero -->
		<section id="spacer"> &nbsp; </section>
		<!-- Main -->
		<div class="row">
			<!-- Left Sidebar -->
			<section class="3u" id="left-sidebar"> <tiles:insertAttribute
				name="menu"></tiles:insertAttribute> </section>
			<!-- Content -->
			<section class="9u" id="content"> <tiles:insertAttribute
				name="body"></tiles:insertAttribute> </section>
		</div>
		<!-- Footer -->
		<div id="footer">
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</div>
	</div>
</body>
</html>