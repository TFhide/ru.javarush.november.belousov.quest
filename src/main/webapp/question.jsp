



















<%--<%@ page language="java" contentType="text/html; charset=utf-8"--%>
<%--         pageEncoding="utf-8"%>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Вопрос</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<header><a href="/">Назад</a></header>--%>
<%--<h1>Следующий вопрос</h1>--%>
<%--<p id="question"></p>--%>
<%--<p>Выберите ответ:</p>--%>
<%--<ul>--%>
<%--    <li><a href="#" id="answer1">Ответ 1</a></li>--%>
<%--    <li><a href="#" id="answer2">Ответ 2</a></li>--%>
<%--</ul>--%>

<%--<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>--%>

<%--<script>--%>
<%--    $(document).ready(function (e) {--%>
<%--        e.preventDefault();--%>
<%--        let questionId = <%= request.getParameter("question") %>;--%>
<%--        let answers = <%= request.getParameter("answers")  %>;--%>

<%--        // Получение вопроса и ответов с сервера--%>
<%--        $.ajax({--%>
<%--            url: 'dispatcher/general',--%>
<%--            type: 'POST',--%>
<%--            data: {--%>
<%--                questionId: questionId,--%>
<%--                answers: answers,--%>
<%--            },--%>
<%--            success: function (data) {--%>
<%--                // Обработка полученных данных--%>
<%--                if (data.hasOwnProperty('question') && data.hasOwnProperty('answers')) {--%>
<%--                    let question = data.question;--%>
<%--                    $('#question').text(question);--%>

<%--                    let answers = data.answers;--%>
<%--                    let answer1 = answers[0].value();--%>
<%--                    let answer2 = answers[1].value();--%>
<%--                    $('#answer1').text(answer1);--%>
<%--                    $('#answer2').text(answer2);--%>
<%--                    $('#answer1').attr('id', 'answer' + answers[0].value());--%>
<%--                    $('#answer2').attr('id', 'answer' + answers[1].value());--%>

<%--                    $('#answer1').click(function () {--%>
<%--                        sendAnswer(1, question);--%>
<%--                    });--%>

<%--                    $('#answer2').click(function () {--%>
<%--                        sendAnswer(2, question);--%>
<%--                    });--%>
<%--                }--%>

<%--                // Отображение вопроса и ответов на странице--%>

<%--                // Назначение обработчиков событий для гиперссылок ответов--%>

<%--            }--%>
<%--        });--%>
<%--    });--%>

<%--        // Отправка ответа на сервер и получение нового вопроса--%>
<%--        function sendAnswer(answerId, questionId) {--%>
<%--            let questId = 1;--%>
<%--            $.ajax({--%>
<%--                url: 'dispatcher/quest',--%>
<%--                type: 'POST',--%>
<%--                data: {--%>
<%--                    quest: questId,--%>
<%--                    questionId: questionId,--%>
<%--                    answerId: answerId--%>
<%--                },--%>
<%--                success: function (data) {--%>
<%--                    // Обработка полученных данных--%>
<%--                    if (data.hasOwnProperty('question') && data.hasOwnProperty('answers')) {--%>
<%--                        let question = data.question;--%>
<%--                        $('#question').text(question);--%>
<%--                        questionId = data.questionId;--%>

<%--                        let answers = data.answers;--%>
<%--                        let answer1 = answers[0].value();--%>
<%--                        let answer2 = answers[1].value();--%>
<%--                        $('#answer1').text(answer1);--%>
<%--                        $('#answer2').text(answer2);--%>
<%--                        $('#answer1').attr('id', 'answer' + answers[0].value());--%>
<%--                        $('#answer2').attr('id', 'answer' + answers[1].value());--%>
<%--                    }--%>
<%--                    // Отображение нового вопроса и ответов на странице--%>
<%--                    // Обновление идентификаторов вопроса и ответов для следующего запроса--%>
<%--                }--%>
<%--            });--%>
<%--        }--%>
<%--                    </script>--%>
<%--</body>--%>
<%--</html>--%>