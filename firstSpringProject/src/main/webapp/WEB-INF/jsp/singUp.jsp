<%@ include file="include/importTags.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" href="<spring:url value='/css/singUp.css'/>" rel="Stylesheet" >
</head>
<body>
<div class="container">
    <div class="main">
        <div class="main-center">
            <form:form
                    id="registerForm"
                    method="post"
                    action="/firstSpringProject/welcome/send"
                    modelAttribute="user">

                <div class="form-group">
                    <label >Your Login</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                        <form:input type="text" class="form-control" path="username"  placeholder="Enter your Login"/>
                    </div>
                </div>
                <div class="form-group">
                    <label>Your Password</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                        <form:input type="password" class="form-control" path="password"  placeholder="Enter your Password"/>
                    </div>
                </div>
                <div class="form-group">
                    <label>Your Name</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                        <form:input type="text" class="form-control" path="nom"  placeholder="Enter your Name"/>
                    </div>
                </div>
                <div class="form-group">
                    <label >Your First Name</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                        <form:input type="text" class="form-control" path="prenom"  placeholder="Enter your First Name"/>
                    </div>
                </div>

                <div class="form-group">
                    <label >Your Email</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                        <form:input type="text" class="form-control" path="email" placeholder="Enter your Email"/>
                    </div>
                </div>
               <div class="form-group">
                    <label >Your Phone</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                        <form:input type="number" class="form-control" path="telephone" placeholder="Enter your Phone"/>
                    </div>
                </div>
                 <div class="form-group">
                    <label >Your Adress</label>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                        <form:input type="text" class="form-control" path="adresse" placeholder="Enter your Adress"/>
                    </div>
                </div>

                <form:button >Sing up</form:button>
            </form:form>
        </div><!--main-center"-->
    </div><!--main-->
</div><!--container-->




</body>
</html>
