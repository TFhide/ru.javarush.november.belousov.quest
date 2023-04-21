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


<section class="text-center">
    <div class="about">
        <div class="container">
            <h2 id="statisticNull"></h2>
            <%--            <div class="row">--%>
            <%--                <div class="col-md-12"></div>--%>
            <%--                <div class="center-text">--%>
            <%--                </div>--%>
            <%--            </div>--%>
                </td>
                <div class="center-text">
                    <h2>Ваш ip-адрес:</h2>
                    <h2 id="headStatistic"></h2>
                </div>
            <div class="statistic">
                <table class="table; center-text" style="margin: 0 auto">
                    <tr>
                        <th id="quantityH" scope="row">Сделано попыток</th>
                        <td id="quantity"></td>
                    </tr>
                    <tr>
                        <th id="winH" scope="row">Количество побед</th>
                        <td id="win"></td>
                    </tr>
                    <tr>
                        <th id="loseH" scope="row">Количество поражений</th>
                        <td id="lose"></td>
                    </tr>
                </table>
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
