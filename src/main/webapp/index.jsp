<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Харе Кришна! Дорогой Господь Кришна!</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $(".link").click(function(e) {
                e.preventDefault();
                // let url = $(this).attr("href");
                // let quest = $(this).data("quest");
                // let question = $(this).data("question");
                $.ajax({
                    type: "GET",
                    url: `/dispatcher/general?quest=${$(this).data("quest")}&question=${$(this).data("question")}`,
                    dataType: "html",
                    success: function(response) {
                        // let question = JSON.parse(response).question;
                        // let answers = JSON.parse(response).answers;
                        // let $ul = $("<ul>"); // создать элемент списка
                        // for (let i = 0; i < answers.length; i++) {
                        //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа
                        //     $ul.append(question);
                        //     $ul.append($li); // добавить элемент списка в список
                        // }
                        // $("#content").html($ul); // добавить список в контейнер с id="content"
                        $('#content').html(response);
                    }
                });
            });

            $("#content").on("click", "input[type=radio]", function(e) {
                let url = "";
                let data = {
                    "answer": $(this).val(),
                    "quest": $("#quest").val(),
                    "question": $("#question").val()
                };
                $.ajax({
                    type: "POST",
                    url: '/dispatcher/general',
                    data: data,
                    dataType: "html",
                    success: function(response) {
                            // let question = JSON.parse(response).question;
                            // let answers = JSON.parse(response).answers;
                            // let $ul = $("<ul>"); // создать элемент списка
                            // for (let i = 0; i < answers.length; i++) {
                            //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа
                            //     $ul.append($li); // добавить элемент списка в список
                            // }
                            // $("#content").html($ul); // добавить список в контейнер с id="content"
                        $('#content').html(response);
                    }
                });
            });
        });
    </script>
</head>
<body>
<h1>Харе Кришна! Дорогой Господь Кришна!</h1>
<p><a href="question.jsp?link=1" class="link">Любовь</a></p>
<p><a href="#" class="link" data-quest="1" data-question="1">Искренность</a></p>
<p><a href="question.jsp?link=3" class="link">Счастье</a></p>
<div id="content"></div>
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
