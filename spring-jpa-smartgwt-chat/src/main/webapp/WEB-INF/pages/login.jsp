<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" />
</head>
<body style="background: #c1abab;">
	<div class="loginPanel">
		<div style="margin: 5px;">Binadox Chat Login</div>
		<hr/>
		<mvc:form method="post" modelAttribute="loginForm">
			<table style="margin: 0px auto;">
				<tr>
					<td colspan="2">
						<span style="color: red;"><c:out value="${loginForm.errorMessage}" /></span>
					</td>
				</tr>
				<tr>
					<td><mvc:label path="login"><b>Login:</b></mvc:label></td>
					<td><mvc:input path="login" /></td>
				</tr>
				<tr>
					<td><mvc:label path="password"><b>Password:</b></mvc:label></td>
					<td><mvc:password path="password" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
						<input type="submit" value="Login" style="margin-top: 20px;" />
					</td>
				</tr>
			</table>		
		</mvc:form>
	</div>
</body>
</html>