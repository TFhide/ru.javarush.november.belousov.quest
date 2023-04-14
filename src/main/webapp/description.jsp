
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<html>
<head>
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/fontello.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">

    <style>
        .center-text {
            text-align: center;
            font-size: 24px;
            color: #664d03;
            font-family: Arial sans-serif;
        }
    </style>
</head>
<body>

<%--<header style="padding: 100px">--%>
<%--    <div class="container">--%>
<%--        <div class="row">--%>
<%--            <div class="col-12"></div>--%>
<%--            <div class="center-text">--%>
<%--            <h1 style="color: #664d03">Путешествие принца Персии: Легенда о затерянной цитадели</h1>--%>
<%--            </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</header>--%>

<section class="text-center">
    <div class="about">
        <div class="container">
<%--            <div class="row">--%>
<%--                <div class="col-md-12"></div>--%>
<%--                <div class="center-text">--%>
<%--                </div>--%>
<%--            </div>--%>
    <div id="descriptionQuest">
        <div class="row">
                <div id="descriptionImage" style="text-align: center;"><img src="" alt="" width="400" height="300"></div>
        </div>
            <div class="row">
                <div class="center-text" id="description">
<%--                <c:out value="${descriptionQuest}"/>--%>
                </div>
            </div>
    </div>
    <div class="row">
        <a href="/" class="start-link">Главная страница</a>
    </div>
        </div>
        </div>
</section>

<footer
        id="footer" style="padding: 30px">
</footer>
<script src="js/bootstrap.bundle.min.js"></script>

</body>
</html>
