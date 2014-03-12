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
<link href="style/jquery.mobile-1.4.2.min.css"	rel="stylesheet" />
<link rel="stylesheet"  href="http://code.jquery.com/mobile/1.0a4.1/jquery.mobile-1.0a4.1.min.css" />
<!--[if lte IE 8]><script src="js/html5shiv.js" type="text/javascript"></script><![endif]-->
<script src="script/jquery-1.10.1.min.js"></script>
<script src="script/jquery.mobile-1.4.2.min.js"></script>
<script src="script/config-plain.js"></script>
<script src="script/skel.min.js"></script>
<script src="script/skel-panels.min.js"></script>
</head>
<body>
	<div class="container">
		<!-- Main -->
		<div class="row">
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