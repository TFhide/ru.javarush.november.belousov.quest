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

<header style="padding: 100px">
  <div class="container">
    <div class="row">
      <div class="col-12"></div>
      <div class="center-text">
        <h1 style="color: #664d03">Путешествие принца Персии: Легенда о затерянной цитадели</h1>
      </div>
    </div>
  </div>
</header>

<section class="text-center">
  <div class="about">
    <div id="question-container" data-quest-id="${quest}" data-question-id="${question}">
      <div class="row">
        <div class="center-text">
          <c:out value="${question.text}"/>
        </div>
      </div>
      <%--            <div class="row">--%>
      <%--                <div class="center-text">--%>
      <%--                    <img src="<%= request.getContextPath() %>/img/PrinceOfPersia/firstQuestion.png" alt="first_scene"--%>
      <%--                         style="width: 300px; height: 200px; margin: 0 auto">--%>
      <%--                </div>--%>
      <%--            </div>--%>
      <div class="row">
        <div>
          <div class="center-text" id="answer1">
            <c:out value="${answers[0].text}"/>
            <p><a href="#" class="answer-link" onclick="submitAnswer(0)">Ответ 1</a></p>
          </div>
        </div>
        <div>
          <div class="center-text" id="answer2">
            <c:out value="${answers[1].text}"/>
            <p><a href="#" class="answer-link" onclick="submitAnswer(1)">Ответ 2</a></p>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

<script>
  function submitAnswer(answerId) {
    let question = document.querySelector('#question-container').getAttribute('data-question-id');
    let quest = document.querySelector('#question-container').getAttribute('data-quest-id');

    $.ajax({
      url: 'dispatcher/quest',
      type: 'POST',
      data: {
        quest: quest,
        questionId: question,
        answerId: answerId
      },
      success: function(data) {
// обработка успешного ответа от сервера
// обновляем контейнер с вопросом и ответами
        // $('#question-container').html(data);
        // разбираем полученные данные
        if (data.hasOwnProperty('question') && data.hasOwnProperty('answers')) {
          let question = data.question;
          let answers = data.answers;

          $('#question-container').find('.center-text').eq(0).text(question.text);
          $('#question-container').find('.center-text').eq(1).text(answers[0].text);
          $('#question-container').find('.center-text').eq(2).text(answers[1].text);
          $('#question-container').attr('data-question-id', question.id);
          $('#question-container').find('#answer1').attr('data-answer-id', answers[0].id);
          $('#question-container').find('#answer2').attr('data-answer-id', answers[1].id);
        }
        else {
          console.log('В объекте data нет свойства question');
        }

        // // обновляем текст вопроса
        // $('#question-container').find('.question-text').text(question.text);
        //
        // // обновляем текст ответов
        // $('#question-container').find('.answer1').text(answers[0].text);
        // $('#question-container').find('.answer2').text(answers[1].text);
        //
        // // обновляем значения атрибутов data- для вопроса и ответов
        // $('#question-container').attr('data-question-id', question.id);
        // $('#question-container').find('.answer1-link').attr('data-answer-id', answers[0].id);
        // $('#question-container').find('.answer2-link').attr('data-answer-id', answers[1].id);
        // $('#question-container').html(data);
      },
      error: function(xhr, status, error) {
// обработка ошибки
        console.log(xhr.responseText);
      }
    });
  }
</script>

<%--<script>--%>
<%--    function submitQuestion(questId, questionId) {--%>
<%--        $.ajax({--%>
<%--            url: 'dispatcher/quest',--%>
<%--            type: 'POST',--%>
<%--            data: {--%>
<%--                questId: questId,--%>
<%--                questionId: questionId--%>
<%--            },--%>
<%--            success: function(data) {--%>
<%--                // обработка успешного ответа от сервера--%>
<%--                // обновляем контейнер с вопросом и ответами--%>
<%--                $('#question-container').html(data);--%>
<%--            },--%>
<%--            error: function(xhr, status, error) {--%>
<%--                // обработка ошибки--%>
<%--                console.log(xhr.responseText);--%>
<%--            }--%>
<%--        });--%>
<%--    }--%>
<%--</script>--%>


<%--<script>--%>
<%--    function submitAnswer(answerIndex) {--%>
<%--        let url = 'dispatcher/quest?toReturn=1&answer=' + answerIndex;--%>
<%--        $.get(url, function(data) {--%>
<%--            $('#question-container').html(data);--%>
<%--        });--%>
<%--    }--%>
<%--</script>--%>

<footer
        id="footer" style="padding: 50px">
</footer>

<script src="js/bootstrap.bundle.min.js"></script>

</body>
</html>
