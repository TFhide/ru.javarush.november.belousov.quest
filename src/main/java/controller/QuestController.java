package controller;

import com.sun.org.slf4j.internal.LoggerFactory;
import controller.dispatcher.MethodType;
import controller.dispatcher.RequestMapping;
import entity.Answer;
import entity.Quest;
import entity.Question;
import org.json.simple.JSONObject;
import service.QuestService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class QuestController {
         private final QuestService serviceQuest;
         private final UserService userService;
         private final Logger Logger = LoggerFactory.getLogger(QuestController.class);

    public QuestController(QuestService questService, UserService userService) {
        this.serviceQuest = questService;
        this.userService = userService;
    }

    @RequestMapping(url = "/description", method = MethodType.GET)
    public void getDescriptionQuest(HttpServletRequest request, HttpServletResponse response)
    {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try {
               response.getWriter().write(serviceQuest.getDescriptionQuest());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    @RequestMapping(url = "/view", method = MethodType.GET)
    public void showQuestion(HttpServletRequest request, HttpServletResponse response)
    {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            response.getWriter().write(serviceQuest.getFirstQuestion().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Question question = serviceQuest.getQuestion(Long.parseLong(request.getParameter("quest")),
//                Long.parseLong(request.getParameter("question")));
//        List<Answer> answers = serviceQuest.getAnswers(Long.parseLong(request.getParameter("quest")),
//                Long.parseLong(request.getParameter("question")));
//
//        String output = "<h2>" + question.getText() +  "</h2>"
//                + "<input type='hidden' name='quest' value='" + Long.parseLong(request.getParameter("quest")) + "'>"
//                + "<input type='hidden' name='question' value='" + Long.parseLong(request.getParameter("question")) + "'>"
//                + "<p><input type='radio' name='answer' value='1'> " + answers.get(0).getText() + "</p>"
//                + "<p><input type='radio' name='answer' value='2'> " + answers.get(1).getText() + "</p>";
//
//        response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");
//        try {
//            response.getWriter().write(output);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    @RequestMapping(url = "/handler", method = MethodType.POST)
    public void showOutcome(HttpServletRequest request, HttpServletResponse response)
    {
//        Long questId = Long.parseLong(request.getParameter("quest"));
//        Long questionId = Long.parseLong(request.getParameter("question"));
//        Long answerId = Long.parseLong(request.getParameter("answer"));

//        Question question = serviceQuest.getQuestion(1L, 2L);
//        List<Answer> answers = serviceQuest.getAnswers(1L, 2L);
//
//        String output = "<h2>" + question.getText() + "</h2>"
//                + "<p><input type='radio' name='answer' value='1'> " + answers.get(0).getText() + "</p>"
//                + "<p><input type='radio' name='answer' value='2'> " + answers.get(1).getText() + "</p>";
//
//        response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");
//        try {
//            response.getWriter().write(output);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(request.getParameter("quest"));
//        System.out.println(request.getParameter("question"));
//        System.out.println(request.getParameter("answer"));
//        System.out.println("request.getParameter(question)= " + request.getParameter("question"));
//        System.out.println("request.getParameter(answer)= " + Long.parseLong(request.getParameter("answer")));
        HttpSession session = request.getSession();
        String ipAddress = request.getRemoteAddr();
        session.setAttribute("ipAddress", ipAddress); // сохраняем атрибут "ip" в сессии

        String ip = (String) session.getAttribute("ipAddress"); // получаем атрибут "name" из сессии
        if (ip != null) {
            if(!userService.isUserInMemory(ip))
            userService.addUser(ip);
            Logger logger = new org.apache.logging.log4j.Logger()
            response.getWriter().println("Hello, " + ip + "!");
        } else {
            response.getWriter().println("Name attribute is not found in session.");
        }
        JSONObject json = new JSONObject();
        boolean checkResult = serviceQuest.checkResultOnTrueOrFalse(serviceQuest.getNextQuestion(1L,
                request.getParameter("question"), Long.parseLong(request.getParameter("answer"))));
        if (checkResult) {
            Question question = (Question) serviceQuest.getNextQuestion(1L,
                    request.getParameter("question"), Long.parseLong(request.getParameter("answer")));
            json.put("question", question.getText());
            json.put("answer1", question.getAnswers().get(0).getText());
            json.put("answer2", question.getAnswers().get(1).getText());
            json.put("image", question.getQuestionImageLink());

//                        String output = "<h2>" + question.getText() + "</h2>"
//                                + "<input type='hidden' name='quest' value='" + Long.parseLong(request.getParameter("quest")) + "'>"
//                                + "<input type='hidden' name='question' value='" + question.getId() + "'>"
//                    + "<p><input type='radio' name='answer' value='1'> " + question.getAnswers().get(0).getText() + "</p>"
//                    + "<p><input type='radio' name='answer' value='2'> " + question.getAnswers().get(1).getText() + "</p>";

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try {
                response.getWriter().write(json.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
//            System.out.println("info");
            String outcome = (String) serviceQuest.getNextQuestion(1L,
                    request.getParameter("question"), Long.parseLong(request.getParameter("answer")));
//            System.out.println("handler = " + outcome);
            json.put("outcome", outcome);
//            String output = "<h2>" + outcome + "</h2>"
//                    + "<p><a href='/'>Стартовая страница</a></p>";

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            try {
                response.getWriter().write(json.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

//        // сохраняем ответ пользователя
////        .saveUserResponse(questId, questionId, answerId);
//
//        // получаем HTML код для контейнера с вопросом и ответами
//        JSONObject jsonObject = serviceQuest.getQuestionContainer(questId, questionId, answerId);
////        if (serviceQuest.checkContentJsonObject(jsonObject)) {
////            request.setAttribute("outcome", serviceQuest.getAnswerForOutcome(questId, questionId, answerId));
////            try {
////                request.getRequestDispatcher("/outcome.jsp").forward(request, response);
////            } catch (ServletException | IOException e) {
////                throw new RuntimeException(e);
////            }
////        }
//        // отправляем JSON код в ответ на запрос
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        try {
//            response.getWriter().write(jsonObject.toJSONString());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//    @RequestMapping(url = "/statistic", method = MethodType.POST)
//    public void addAndGetUserStatistic(HttpServletRequest request, HttpServletResponse response)
//    {
//
//
//
//    }


    @RequestMapping(url = "/controller", method = MethodType.GET)
    public void showAllQuests(HttpServletRequest request, HttpServletResponse response)
    {
        String answerParam = request.getParameter("answer");
        if (answerParam != null) {
            int answer = Integer.parseInt(answerParam);
            if (answer == 1) {
                request.setAttribute("quests", serviceQuest.findAllQuests());
                try {
                    request.getRequestDispatcher("/test.jsp").forward(request, response);
                } catch (ServletException | IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (answer == 2) {
                 // ...
            }
        }
    }
}

