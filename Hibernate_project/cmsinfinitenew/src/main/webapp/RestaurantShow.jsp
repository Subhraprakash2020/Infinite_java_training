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
				<h:outputText value="Resturant Records" />
			</h2>
		</center>
		<h:dataTable value="#{restaurant.showRestaurantDao()}" var="e"
			border="3">
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Restaurant Id" />
				</f:facet>
				<h:outputText value="#{e.restaurantId}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Restaurant Name" />
				</f:facet>
				<h:outputText value="#{e.restaurantName}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Branch" />
				</f:facet>
				<h:outputText value="#{e.branch}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="city" />
				</f:facet>
				<h:outputText value="#{e.city}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Mobile No" />
				</f:facet>
				<h:outputText value="#{e.mobileno}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Email" />
				</f:facet>
				<h:outputText value="#{e.email}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Rating" />
				</f:facet>
				<h:outputText value="#{e.rating}" />
			</h:column>
			
			<h:column>
			<h:commandButton action="#{menu.showMenuDao(e.restaurantId)}" value="Show" />
			</h:column>


		</h:dataTable>
	</h:form>


</body>
	</html>
</f:view>