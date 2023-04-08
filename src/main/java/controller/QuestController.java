package controller;

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

public class QuestController {
         private final QuestService serviceQuest;
         private final UserService userService;

    public QuestController(QuestService questService, UserService userService) {
        this.serviceQuest = questService;
        this.userService = userService;
    }

    @RequestMapping(url = "/introduce", method = MethodType.GET)
    public void getDescriptionQuest(HttpServletRequest request, HttpServletResponse response)
    {
        String introduce = request.getParameter("introduce");
        if(introduce != null) {
            String descriptionQuest = serviceQuest.getDescriptionQuest();
            request.setAttribute("descriptionQuest", descriptionQuest);
            try {
                request.getRequestDispatcher("/description.jsp").forward(request, response);
            } catch (ServletException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @RequestMapping(url = "/homePage", method = MethodType.GET)
    public void returnToHomePage(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            response.sendRedirect(request.getContextPath() + "/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping(url = "/general", method = MethodType.POST)
    public void showQuestion(HttpServletRequest request, HttpServletResponse response)
    {
        Question question = serviceQuest.getQuestion(Long.parseLong(request.getParameter("quest")),
                Long.parseLong(request.getParameter("question")));
        List<Answer> answers = serviceQuest.getAnswers(Long.parseLong(request.getParameter("quest")),
                Long.parseLong(request.getParameter("question")));
        request.setAttribute("question", question);
        request.setAttribute("answers", answers);
        try {
            request.getRequestDispatcher("/question.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping(url = "/quest", method = MethodType.POST)
    public void showOutcome(HttpServletRequest request, HttpServletResponse response)
    {
        long questId = Long.parseLong(request.getParameter("questId"));
        long questionId = Long.parseLong(request.getParameter("questionId"));
        long answerId = Long.parseLong(request.getParameter("answerId"));

        // сохраняем ответ пользователя
//        .saveUserResponse(questId, questionId, answerId);

        // получаем HTML код для контейнера с вопросом и ответами
        JSONObject jsonObject = serviceQuest.getQuestionContainer(questId, questionId, answerId);
//        if (serviceQuest.checkContentJsonObject(jsonObject)) {
//            request.setAttribute("outcome", serviceQuest.getAnswerForOutcome(questId, questionId, answerId));
//            try {
//                request.getRequestDispatcher("/outcome.jsp").forward(request, response);
//            } catch (ServletException | IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
        // отправляем JSON код в ответ на запрос
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(jsonObject.toJSONString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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

