<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp" flush="true">
	<jsp:param  value="zhangsan"  name="username"/>
</jsp:include>
这<br/>
是<br/>
主<br/>
体<br/>
部<br/>
分<br/>
！
<jsp:include page="footer.jsp" flush="true"></jsp:include>

</body>
</html>