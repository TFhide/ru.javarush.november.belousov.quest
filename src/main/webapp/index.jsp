<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/fontello.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
    <meta charset="UTF-8">
    <style>
        .center-text {
            text-align: center;
            font-size: 24px;
            color: var(--color1);
            font-family: Arial sans-serif;
        }
    </style>
    <title>Путешествие принца Персии!</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="script.js"></script>
</head>
<body>

<header style="padding: 80px;">
    <div class="container">
        <div class="row">
            <div class="col-12"></div>
            <div class="center-text">
                <h1 style="color: var(--color1); margin-top: 50px">Путешествие принца Персии: Легенда о затерянной цитадели</h1>
            </div>
        </div>
    </div>
</header>

<section>
    <div class="about">
    <div id="content">
        <div class="center-text">
            <h1>Харе Кришна! Дорогой Господь Кришна!</h1>
            <div class="row">
                <p><a href="#" class="description-link" style="color: #664d03"><span class="quests-icon icon-down-open"></span>Предыстория</a></p>
            </div>
            <div class="row">
                <p><a href="#" class="section-link"><span class="quests-icon icon-paper-plane"></span>Запуск квеста</a></p>
            </div>
            <div class="row">
                <p><a href="#" class="section-link"><span class="quests-icon icon-chart-bar"></span>Статистика</a></p>
            </div>
        </div>
    </div>
    </div>
</section>


<%--<div id="question-container" data-quest-id="${quest}" data-question-id="${question}">--%>
<%--<div class="row">--%>
<%--    <div class="center-text">--%>
<%--        <c:out value="${question.text}"/>--%>
<%--    </div>--%>
<%--</div>--%>
<%--    <div class="row">--%>
<%--        <div>--%>
<%--            <div class="center-text" id="answer1">--%>
<%--                <c:out value="${answers[0].text}"/>--%>
<%--                <p><a href="#" class="answer-link" onclick="submitAnswer(0)">Ответ 1</a></p>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div>--%>
<%--            <div class="center-text" id="answer2">--%>
<%--                <c:out value="${answers[1].text}"/>--%>
<%--                <p><a href="#" class="answer-link" onclick="submitAnswer(1)">Ответ 2</a></p>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>


<footer
        id="footer" style="padding: 50px">
</footer>

<%--<script src="js/bootstrap.bundle.min.js"></script>--%>






<%--<title>Харе Кришна! Дорогой Господь Кришна!</title>--%>
<%--<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>--%>
<%--<script type="text/javascript">--%>
<%--    $(document).ready(function() {--%>
<%--        $(".link").click(function(e) {--%>
<%--            e.preventDefault();--%>
<%--            // let url = $(this).attr("href");--%>
<%--            // let quest = $(this).data("quest");--%>
<%--            // let question = $(this).data("question");--%>
<%--            $.ajax({--%>
<%--                type: "GET",--%>
<%--                url: `/dispatcher/view?quest=${$(this).data("quest")}&question=${$(this).data("question")}`,--%>
<%--                dataType: "html",--%>
<%--                success: function(response) {--%>
<%--                    // let question = JSON.parse(response).question;--%>
<%--                    // let answers = JSON.parse(response).answers;--%>
<%--                    // let $ul = $("<ul>"); // создать элемент списка--%>
<%--                    // for (let i = 0; i < answers.length; i++) {--%>
<%--                    //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа--%>
<%--                    //     $ul.append(question);--%>
<%--                    //     $ul.append($li); // добавить элемент списка в список--%>
<%--                    // }--%>
<%--                    // $("#content").html($ul); // добавить список в контейнер с id="content"--%>
<%--                    $('#content').html(response);--%>
<%--                }--%>
<%--            });--%>
<%--        });--%>

<%--        $("#content").on("click", "input[type=radio]", function(e) {--%>
<%--            // let url = "";--%>
<%--            let data = {--%>
<%--                "quest": $("input[name='quest']").val(),--%>
<%--                "question": $("input[name='question']").val(),--%>
<%--                "answer": $(this).val(),--%>
<%--            };--%>
<%--            $.ajax({--%>
<%--                type: "POST",--%>
<%--                url: '/dispatcher/handler',--%>
<%--                data: data,--%>
<%--                dataType: "html",--%>
<%--                success: function(response) {--%>
<%--                    // let question = JSON.parse(response).question;--%>
<%--                    // let answers = JSON.parse(response).answers;--%>
<%--                    // let $ul = $("<ul>"); // создать элемент списка--%>
<%--                    // for (let i = 0; i < answers.length; i++) {--%>
<%--                    //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа--%>
<%--                    //     $ul.append($li); // добавить элемент списка в список--%>
<%--                    // }--%>
<%--                    // $("#content").html($ul); // добавить список в контейнер с id="content"--%>
<%--                    $('#content').html(response);--%>
<%--                }--%>
<%--            });--%>
<%--        });--%>
<%--    });--%>
<%--</script>--%>

<%--<h1>Харе Кришна! Дорогой Господь Кришна!</h1>--%>
<%--<p><a href="question.jsp?link=1" class="link">Любовь</a></p>--%>
<%--<p><a href="#" class="link" data-quest="1" data-question="1">Искренность</a></p>--%>
<%--<p><a href="question.jsp?link=3" class="link">Счастье</a></p>--%>
<%--<div id="content"></div>--%>
</body>
</html>

<%--<%@ page language="java" contentType="text/html; charset=utf-8"--%>
<%--         pageEncoding="utf-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Привет Мир!</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<header>Привет Мир!</header>--%>
<%--<nav>--%>
<%--    <ul>--%>
<%--        <li><a href="dispatcher/introduce?introduce=1">Предыстория</a></li>--%>
<%--        <li><a href="dispatcher/general?quest=1&question=2">Начать квест</a></li>--%>
<%--        <li><a href="dispatcher/general?quest=1&question=3">Статистика</a></li>--%>
<%--    </ul>--%>
<%--</nav>--%>
<%--</body>--%>
<%--</html>--%>
