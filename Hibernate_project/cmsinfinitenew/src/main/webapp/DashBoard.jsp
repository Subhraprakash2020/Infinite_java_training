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
        Welcome to : <b> <h:outputText value="#{loggedCustomer}" />
			<br /> <br />
		</b>
		<h:commandLink action="#{customerDao.searchCustomerDetailsDao()}"
			id="link1">
			<h:outputLabel value="Show Customer Info" />
		</h:commandLink>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	 <h:commandLink action="#{customerDao.showCustomerWalletDao()}"
			id="link2">
			<h:outputLabel value="Show Customer Wallets" />
		</h:commandLink>
	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <h:commandLink action="PlaceOrder.jsp">
			<h:outputLabel value="Place Order" />
		</h:commandLink>

	</h:form>

</body>

	</html>

</f:view>