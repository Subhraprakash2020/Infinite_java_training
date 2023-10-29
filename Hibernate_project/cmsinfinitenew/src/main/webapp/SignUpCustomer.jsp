<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h:form>
		<h2 style="text-align: center" class="col-sm-4">SignUp Customer</h2>
		Customer Name:
		<h:inputText id="cusName" value="#{customer.cusName }" />
		<br></br>
		Customer Phone:
		<h:inputText id="cusPhn" value="#{customer.cusPhnNo }" />
		<br></br>
		UserName:
		<h:inputText id="cusUser" value="#{customer.cusUsername }" />
		<br></br>
		Password:
		<h:inputText id="cusPass" value="#{customer.cusPassword}" />
		<br></br>
		Email:
		<h:inputText id="cusEmail" value="#{customer.cusEmail }" />
		<br></br>
		<h:commandButton value="SignUp" action="#{customerDao.signInDao(customer) }"  />
	</h:form>


</body>
	</html>
</f:view>