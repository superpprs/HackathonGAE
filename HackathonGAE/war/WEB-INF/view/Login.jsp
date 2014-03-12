<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="loginForm"
	action="<%=request.getContextPath()%>/j_spring_security_check"
	method="post" name="loginForm">
	<div align="center">
		<div class="frmTealDataBold" style="width: 600px">
			<h2>Please login for a thrilling new experience of Online
				Rummy!!</h2>
		</div>
	</div>
	<div class="roundBorderLeftShadow moveDown4px"
		style="width: 500px; float: right;">
		<div align="right" style="float: right;">
			<table>
				<tr>
					<td align="right" style="width: 80px"><label
						class="textHeadingBold" for="userName">Maniac ID</label></td>
					<td><input class="frmInput125px" id="userName" name="userName"
						type="text" /></td>
				</tr>
				<tr>
					<td align="right" style="width: 80px"><label for="password"
						class="textHeadingBold">Pass-code</label></td>
					<td><input class="frmInput125px" id="password" name="password"
						type="password" /></td>
				</tr>
				<!-- 				<tr> -->
				<!-- 					<td style="width: 80px;">&nbsp;</td> -->
				<!-- 					<td align="left"><input class="resultSetCheckbox" -->
				<!-- 						type="checkbox" id="rememberMe" name="rememberMe"> <label -->
				<!-- 						class="textHeadingBold moveUp" for="rememberMe">Remember -->
				<!-- 							Me</label></td> -->
				<!-- 				</tr> -->
				<tr>
					<td style="width: 80px;"><input class="otherButtonsBoldSmall"
						id="login" name="login" type="submit" value="Go Maniac!"></td>
					<td align="right">
						<div style="text-align: center">

							<input class="otherButtonsMedium" id="cancel" name="cancel"
								type="reset" value="Nope, not now..">
						</div>
				</tr>
			</table>
		</div>
		<div align="right">
			<table>
				<tr>
					<td>
						<div align="right">
							<a class="linkBold" href="newUserRegistration.do">Not a part
								of us yet?? Jump in, it is simple and free!!</a> | <a
								class="linkTxtSmall" href="forgotPassword.do">Forgot
								Password?</a>
						</div>
					</td>
				</tr>
			</table>
		</div>
		<c:if test="${authMessage ne null }">
			<div class="mandatory" align="right" style="font-size: 9px;">${authMessage}</div>
		</c:if>
	</div>
</form>