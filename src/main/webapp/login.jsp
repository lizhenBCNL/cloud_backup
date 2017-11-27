<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>登录</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/addBackupJob"
		method="post">
		用户名：<input type="text" name="name"> 
		描述：<input type="text" name="snmpNotification">
		邮箱：<input type="text" name="emails"><input type="submit"
			value="登录">
	</form>

</body>
</html>