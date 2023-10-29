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
		<h:selectOneMenu id="localCode" value="#{roomEjb.localCode}"
			onchange="submit()"
			valueChangeListener="#{roomEjb.roomLocaleCodeChanged()}">
			<f:selectItems value="#{roomEjb.showRoomTypeEjb()}" />
		</h:selectOneMenu>
		<h:outputLabel id="heading" value="Selected room is " />
		<h:outputText id="result" value="#{roomEjb.localCode}" />
	<%-- 	<h:dataTable id="tableRender"
			value="#{roomEjb.showRoomTypeEjb()}" var="e"
			border="3">
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Room No" id="roomno" />
				</f:facet>
				<h:outputText value="#{e.roomno}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Room Type" id="roomtype" />
				</f:facet>
				<h:outputText value="#{e.roomtype}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Status" id="status" />
				</f:facet>
				<h:outputText value="#{e.status}" />
			</h:column>

		</h:dataTable> --%>
	</h:form>
	</html>
</f:view>
