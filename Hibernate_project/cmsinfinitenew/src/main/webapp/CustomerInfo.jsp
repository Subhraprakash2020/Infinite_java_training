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


	<h2>
		<h:outputText value="Customer Details" />
	</h2>

	Customer Name :
	<h:outputText value="#{customerFound.cusName}" /><br>
	Customer Phone :
	<h:outputText value="#{customerFound.cusPhnNo}" /><br>
	Customer Username :
	<h:outputText value="#{customerFound.cusUsername}" /><br>
	Customer Email :
	<h:outputText value="#{customerFound.cusEmail}" />



</body>
	</html>
</f:view>