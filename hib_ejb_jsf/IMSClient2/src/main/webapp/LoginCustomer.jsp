<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
	<f:view>
    <html>
        <h:form id="form">
            <h2>Verify OTP</h2>
            <h:outputText value="User Name" />
            <h:inputText id="name" value="#{custAuth.userName}" />
            <br />
           
            <h:outputText value="Password" />
            <h:inputText id="password" value="#{custAuth.passcode}" />
            <br />
            <h:commandButton action="#{ejbCustomer.loginDao(custAuth)}" value="Verify" />
            <h:commandButton type="reset" value="Reset" />
        </h:form>
    </html>
</f:view>

