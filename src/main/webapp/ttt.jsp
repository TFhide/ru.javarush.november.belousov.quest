<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
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

<header>
  <div class="container">
    <div class="row">
      <div class="col-12"></div>
      <div class="center-text">
        <h1 class="text-center" style="color: #664d03">Путешествие принца Персии: Легенда о затерянной цитадели</h1>
      </div>
      <%--            <div class="itd_play" data-bs-toggle="modal" data-bs-target="#statisticMyModal">--%>
      <%--                <div class="itd_play" data-bs-toggle="modal" data-bs-target="#statisticMyModal">--%>
      <%--                <div class="itd_triangle"></div>--%>
      <%--            </div>--%>
      <%--            <a href="#footer" class="btn btn-itd btn-lg text-uppercase">BUY</a>--%>
      <%--                <p>Этот текст будет <span style="color: red;">красным</span> и <span style="font-weight: bold;">жирным</span></p>--%>
      <%--        </div>--%>
    </div>
  </div>
</header>

<section class="text-center">
  <div class="about">
    <div class="container">
      <%--        <div class="row">--%>
      <%--            <div class="col-md-12"></div>--%>
      <%--                <h2 class="text-center text-uppercase color1 mb-5" style="color: #664d03">sdadsadasd</h2>--%>
      <%--        </div>--%>
      <div class="row">
        <div class="col-md-12"></div>
        <div class="center-text">
          <img src="<%= request.getContextPath() %>/img/PrinceOfPersia/first_scene.png" alt="first_scene" style="width: 300px; height: 200px">
          <img src="<%= request.getContextPath() %>/img/PrinceOfPersia/first_scene.png" alt="first_scene" style="width: 300px; height: 200px; margin: 0 auto">
          <img src="<%= request.getContextPath() %>/img/PrinceOfPersia/first_scene.png" alt="first_scene" style="width: 300px; height: 200px; margin-right: 100px">
          <p><a href="dispatcher/introduce?introduce=1" class="answer-link">
            <span class="quests-icon icon-down-open"></span>
            Предыстория
          </a></p>
        </div>
      </div>
      <div class="row">
        <div class="center-text">
          <p><a href="dispatcher/general?quest=1&amp;question=1" class="answer-link">
            <%--    <p><a href="#" class="quests-link" onclick="submitQuestion(1 ,questId=1, questionId=1)">--%>
            <span class="quests-icon icon-paper-plane"></span>
            Запуск квеста
          </a></p>
        </div>
      </div>
      <div class="row">
        <div class="center-text">
          <p><a href="dispatcher/controller?statistic=1" class="answer-link">
            <span class="quests-icon icon-chart-bar"></span>
            Статистика
          </a></p>
        </div>
      </div>
    </div>
  </div>
</section>

<%--<script>--%>
<%--    function submitQuestion(index,questId, questionId) {--%>
<%--        let url = 'dispatcher/quest?' + '+' + questId  a toReturn=1&answer=' + answerIndex;--%>
<%--        $.get(url, function(data) {--%>
<%--            $('#question-container').html(data);--%>
<%--        });--%>
<%--    }--%>
<%--</script>--%>

<%--                    <div class="row" id="describeQuest">--%>
<%--                        <div class="itd_circle"><i class="icon-list-numbered"></i></div>--%>
<%--                        <h5 class="text-center">Описание</h5>--%>
<%--&lt;%&ndash;                        <a href="https://yandex.ru" ></a>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <div class="line"></div>&ndash;%&gt;--%>
<%--                        </div>--%>
<%--                   --%>
<%--                    <div class="row" id="toStartQuest">--%>
<%--                        <div class="itd_circle" onclick=""><i class="icon-list-numbered"></i></div>--%>
<%--&lt;%&ndash;                        <a href="/dispatcher/">Принять вызов</a>&ndash;%&gt;--%>
<%--                        <div class="line"></div>--%>
<%--                    </div>--%>
<%--                    <div class="row" id="statisticQuest">--%>
<%--                        <div class="itd_circle"><i class="icon-list-numbered"></i></div>--%>
<%--&lt;%&ndash;                        <a href="/index.jsp">Статистика</a>&ndash;%&gt;--%>
<%--                        <div class="line"></div>--%>
<%--                    </div>--%>


<%--<script>--%>
<%--    document.getElementById("describeQuest").addEventListener("click",myFunctionOne);--%>
<%--    document.getElementById("toStartQuest").addEventListener("click",myFunctionOne);--%>
<%--    document.getElementById("statisticQuest").addEventListener("click", myFunctionOne)--%>

<%--    function myFunctionOne() {--%>
<%--        let xhr = new XMLHttpRequest();--%>
<%--        xhr.open("GET", "dispatcher",true);--%>
<%--        xhr.send();--%>

<%--        xhr.onreadystatechange = function () {--%>
<%--            if (xhr.readyState === XMLHttpRequest.DONE) {--%>
<%--                if (xhr.status === 200) {--%>
<%--                    alert(xhr.responseText);--%>
<%--                }--%>
<%--                else {--%>
<%--                    alert("Произошла ошибка")--%>
<%--                }--%>
<%--            }--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

<footer
        id="footer">
</footer>
<script src="js/bootstrap.bundle.min.js"></script>


<%--<div class="modal fade" id="describeMyModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h1 class="modal-title fs-5" id="describeModalLabel">Introduce to the Quest</h1>--%>
<%--                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <div class='embed-container'>--%>
<%--                    <h5 class="text-center text- text-dark">Добро пожаловать в захватывающий мир фантастических приключений и опасных испытаний! Вы готовы отправиться вместе с принцем Персии на поиски затерянной цитадели? Этот квест полон увлекательных загадок, незабываемых встреч и сражений с опасными противниками. Вас ждет захватывающее приключение, полное экшена и неожиданных поворотов сюжета. Сможете ли вы пройти все испытания, чтобы найти затерянную цитадель и разгадать ее тайны? Предстоит много опасных решений и рискованных действий, но награда стоит того - несметные богатства и бесценные знания ждут того, кто сможет достичь цели. Приготовьтесь к захватывающему приключению, которое оставит незабываемые впечатления на всю жизнь!</h5>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<div class="modal fade" id="toStartQuestMyModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h1 class="modal-title fs-5" id="toStartQuestModalLabel">Introduce to the Quest</h1>--%>
<%--                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <div class='embed-container'>--%>

<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<div class="modal fade" id="statisticMyModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h1 class="modal-title fs-5" id="statisticModalLabel">Introduce to the Quest</h1>--%>
<%--                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <div class='embed-container'>--%>
<%--                    <iframe src='https://www.youtube.com/embed//mqqft2x_Aa4' frameborder='0' allowfullscreen></iframe>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
</html>





<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-list-numbered"></i></div>--%>
<%--                    <h5 class="text-center">Section one</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-mail-alt"></i></div>--%>
<%--                    <h5 class="text-center">Section two</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-mobile"></i></div>--%>
<%--                    <h5 class="text-center">Section three</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-code"></i></div>--%>
<%--                    <h5 class="text-center">Section four</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-youtube-play"></i></div>--%>
<%--                    <h5 class="text-center">Section five</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-instagram"></i></div>--%>
<%--                    <h5 class="text-center">Section six</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-vkontakte"></i></div>--%>
<%--                    <h5 class="text-center">Section seven</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-file-video"></i></div>--%>
<%--                    <h5 class="text-center">Section eight</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--                <div class="col-xxl-4 col-md-6 col-sm-12">--%>
<%--                    <div class="itd_circle"><i class="icon-help"></i></div>--%>
<%--                    <h5 class="text-center">Section nine</h5>--%>
<%--                    <div class="line"></div>--%>
<%--                </div>--%>
<%--            </div>--%>




<%--<section>--%>
<%--    <div class="forwhom">--%>
<%--        <div class="container">--%>
<%--            <div class="row">--%>
<%--                <div class="col-12"></div>--%>
<%--                <h2 class="text-center text-uppercase color2 mb-5">Квест для тех кому интересно</h2>--%>
<%--            </div>--%>
<%--            <div class="row mb-5">--%>
<%--                <div class="col-md-6 col-sm-12"></div>--%>
<%--                <h5 class="text-center">В далекие времена правительство страны переживало трудные времена. Империя была раздроблена, властью завладели коррумпированные чиновники, а народ страдал от бедности и безработицы. В такое время на свет появилась легенда о затерянной цитадели, которая хранила в себе несметные богатства и могла принести счастье и процветание всей стране. Но никто не мог найти ее местонахождение.--%>
<%--                    Однажды принц Персии решил отправиться на поиски цитадели, чтобы вернуть своей стране благоденствие и порядок. Он нашел смельчака, готового присоединиться к нему в этом опасном приключении. Вместе они прошли через тысячи опасностей, сражались со злыми врагами и обходили смертельные ловушки. Они встретили загадочного старца, </h5>--%>
<%--            </div>--%>
<%--            <--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>
