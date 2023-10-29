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

	<h1>Home Page</h1>
	<h2>Welcome to our website</h2>
	<h:form>
		
			
			<h:commandLink action="CustomerLogin">
				<h:outputLabel value="Customer Login" />
			</h:commandLink>
			<br>
        <h:commandLink action="VendorLogin">
				<h:outputLabel value="Vendor Login" />
			</h:commandLink>
		
	</h:form>
</body>


	</html>
</f:view>