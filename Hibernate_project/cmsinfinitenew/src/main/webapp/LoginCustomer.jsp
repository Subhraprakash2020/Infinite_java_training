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
		<center>
			<h2>
				<h:outputText value="Login Customer" />
			</h2>
			<h:outputText value="Customer Login" />
		
			
				<h:outputText value="UserName : " />
				<h:inputText value="#{customer.cusUsername}" />
				<br />
				<br />
				<h:outputText value="Password : " />
				<h:inputText value="#{customer.cusPassword}" />
				<br />
				<br />
				<h:commandButton action="#{customerDao.validateMe(customer)}"
					value="Login" />
		</center>


	</h:form>


</body>
	</html>
</f:view>