<%-- <%@page contentType="text/html"%>
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
    <jsp:include page="Menu.jsp"/>
        <h:form>
        <center>
                <h2><h:outputText value="Employ Records"/></h2>
            </center>
        <h:dataTable value="#{employController.showEmploy()}" var="e" border="3">
        	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Employ No" />
                    </f:facet>
                    <h:outputText value="#{e.empno}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Employ Name" />
                    </f:facet>
                    <h:outputText value="#{e.name}"/>
                </h:column>
                 <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Gender" />
                    </f:facet>
                    <h:outputText value="#{e.gender}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Department" />
                    </f:facet>
                    <h:outputText value="#{e.dept}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Designation" />
                    </f:facet>
                    <h:outputText value="#{e.desig}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Salary" />
                    </f:facet>
                    <h:outputText value="#{e.basic}"/>
                </h:column>
        </h:dataTable>
        </h:form>
    </body>
</html>
</f:view>

 --%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Menu.jsp"/>
        <h:form id="formId">
            <center>
                <h2><h:outputText value="Employ Records"/></h2>
            </center>
            <h:dataTable value="#{employPaginationBean.employDataModel}" var="e" border="3">
                <h:column>
                    <f:facet name="header">
                        <h:outputLabel value="Employ No" />
                    </f:facet>
                    <h:outputText value="#{e.empno}"/>
                </h:column>
                <!-- Add other columns here -->
            </h:dataTable>

            <h:commandButton value="Next" action="#{employPaginationBean.nextPage}" 
                             rendered="#{employPaginationBean.hasNextPage()}" />
            <h:commandButton value="Previous" action="#{employPaginationBean.previousPage}" 
                             rendered="#{employPaginationBean.hasPreviousPage()}" />
        </h:form>
    </body>
</html>
</f:view>

