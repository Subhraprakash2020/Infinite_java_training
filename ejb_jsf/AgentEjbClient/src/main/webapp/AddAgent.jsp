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
	<h2>Create Employ</h2>
	<h:form>
		<h2 style="text-align: center" class="col-sm-4">Employ Record</h2>
	  
	  Agent Name 
	  <h:inputText id="name" value="#{agent.name}" />
		<br></br>
	  City
	  <h:inputText id="city" value="#{agent.city}" />
		<br></br>
	  Gender
	  	  <h:inputText id="gender" value="#{agent.gender}" />
		<br></br>
	 Maritial Status
	 	  <h:inputText id="maritalStatus" value="#{agent.maritalStatus}" />
		<br></br>
	 Premium
	 	  <h:inputText id="premium" value="#{agent.premium}" />
		<br></br>
		<h:commandButton value="Save"
			action="#{agentEjb.addAgnet(agent)}"></h:commandButton>

	</h:form>
</body>
</html>
</f:view>