<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ include file="../include/importTags.jsp"%>
<%@ include file="../../../js/template.js"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<head>
    <link  type="text/css" href=<spring:url value="/css/first.css"/> rel="Stylesheet" >
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>

<div class="div-princ">
    <div class="imageDiv">
        <img src="Images/logo.png" class="logoImage">
         <p class="title">HexagonePC</p>
        <img src="Images/en-flag.png" class="language">
        <img src="Images/fr-flag.png" class="language">
        
    </div>


    <div class="container">
        <div class="row">
            <div>
                <ul class="nav">
                    <li><a href="#">Acceuil</a></li>
                    <li id="categories"><a href="#">Magasin</a>
                        <ul class ="sub">
                            <script>
                                $.get( "/categories", function(data) {
                                    $("#content ul li:last").append('<li><a href="#">data</a></li>');
                                });
                            </script>
                        </ul>
                    <li><a href="#">Contactez nous</a></li>
                    <li><a href="#">A propos de nous</a></li>
                    <sec:authorize access="isAnonymous()">
                        <li><a href="#">Se connecter</a></li>
                        <li><a href="#">Créer mon compte</a></li>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                        <li><a href="#">Déconnection</a></li>
                    </sec:authorize>

                </ul>
            </div>
        </div>
    </div>
    <div>
        <tiles:insertAttribute name="main-content"/>
    </div>
</div>

</body>
<footer>
    <div class="footer">
        <div class="container">
            <p class="footerDiv">
                Acceuil
            </p>
            <p class="copyright" >
                Copyright © 2018 All rights reserved
            </p>
        </div>
    </div>
</footer>
</html>
