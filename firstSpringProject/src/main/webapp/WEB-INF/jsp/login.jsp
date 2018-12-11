<%@ page  language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" href="<spring:url value='/css/login.css'/>" rel="Stylesheet" >
</head>
<body>
<div id="LoginForm">
    <div class="container">
        <h1 class="form-heading">login Form</h1>
        <div class="login-form">
            <div class="main-div">
                <div class="panel">
                    <h2>User Login</h2>
                    <p>Please enter your email and password</p>
                </div>
                <form:form
                        id="loginForm"
                        method = "POST"
                        action="/firstSpring/welcome"
                        modelAttribute="user">
                    <div class="form-group">
                        <form:input path="username" class="form-control" placeholder="Login"/>
                    </div>
                    <div class="form-group">
                        <form:input  path="password" type="password" class="form-control" placeholder="Password"/>
                    </div>
                        <form:button class="btn btn-primary">Login</form:button>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
