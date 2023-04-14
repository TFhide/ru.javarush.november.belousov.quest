
$(document).ready(function() {

    $(".section-link").click(function(e) {
        e.preventDefault();
        loadData();
    });
    function loadData() {
        $.ajax({
            type: "GET",
            url: `/dispatcher/view`,
            dataType: "json",
            success: function(response) {
                // $('.question-containerRR').load('que.jsp');
                // $('#answer1').text(answers[0].text());
                // $('#answer2').text(answers[1].text());
                // let $ul = $("<ul>"); // создать элемент списка
                // $ul.append(question);
                // for (let i = 0; i < answers.length; i++) {
                //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа
                //     $ul.append($li); // добавить элемент списка в список
                // }
                // $("#content").html($ul); // добавить список в контейнер с id="content"
                // $('#question').html($ul);      // continue
                $('#content').load('que.jsp', function () {
                    $('#question').html(response.question);
                    $("#answer1 .answer-link").text(response.answer1);
                    $("#answer2 .answer-link").text(response.answer2);
                    $('#image img').attr('src', response.image.replace(/\\/g, ''));
                });
            }
        });
    }

        // let url = $(this).attr("href");
        // let quest = $(this).data("quest");
        // let question = $(this).data("question");

    // $("#question-container").on("click", "input[type=radio]", function(e) {
    $("#question-container").on("click", ".answer-link", function(e) {
    // let url = "";
    e.preventDefault();
    let data = {
    // "quest": $("input[name='quest']").val(),
    // "question": $("input[name='question']").val(),
    // "answer": $(this).val(),
        "question" : $("#question").text(),
    "answer" : $(this).data("answer")
    };
    $.ajax({
    type: "POST",
    url: '/dispatcher/handler',
    data: data,
    dataType: "json",
    success: function(response) {
        if(response.outcome) {
            $('#content').load('outcome.jsp', function () {
                $('#outcome').html(response.outcome)
            })
        }
        else {
            $('#content').load('que.jsp', function () {
                $('#question').html(response.question);
                $("#answer1 .answer-link").text(response.answer1);
                $("#answer2 .answer-link").text(response.answer2);
                $('#questionImage img').attr('src', response.image.replace(/\\/g, ''));
            });
        }
    // let question = JSON.parse(response).question;
    // let answers = JSON.parse(response).answers;
    // let $ul = $("<ul>"); // создать элемент списка
    // for (let i = 0; i < answers.length; i++) {
    //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа
    //     $ul.append($li); // добавить элемент списка в список
    // }
    // $("#content").html($ul); // добавить список в контейнер с id="content"
}
});
});

    $(".description-link").click(function (e) {
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: `/dispatcher/description`,
            dataType: "json",
            success: function (response) {
                // $('.question-containerRR').load('que.jsp');
                // $('#answer1').text(answers[0].text());
                // $('#answer2').text(answers[1].text());
                // let $ul = $("<ul>"); // создать элемент списка
                // $ul.append(question);
                // for (let i = 0; i < answers.length; i++) {
                //     let $li = $("<li>").text(answers[i].text); // создать элемент списка с текстом ответа
                //     $ul.append($li); // добавить элемент списка в список
                // }
                // $("#content").html($ul); // добавить список в контейнер с id="content"
                // $('#question').html($ul);      // continue
                $('#content').load('description.jsp', function () {
                    $('#description').html(response.description);
                    $('#descriptionImage img').attr('src', response.image.replace(/\\/g, ''));
                });
            }
        });
    });
});
