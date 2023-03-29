package controller;

import controller.dispatcher.MethodType;
import controller.dispatcher.RequestMapping;
import service.QuestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class QuestController {
         QuestService serviceQuest;

@RequestMapping(url = "/quests", methodType = MethodType.GET)
    public String showAllQuests(HttpServletRequest request, HttpServletResponse response) {
    String param = request.getParameter("param");
    String method = request.getMethod();
    HttpSession session = request.getSession();


    return null;
    }
}



//     questMap.put(1, "Потерянный артефакт темных времен");
//     questMap.put(2, "Побег из запертой комнаты");
//     questMap.put(3, "Путешествие принца Персии: Легенда о затерянной цитадели");
//     questMap.put(4, "Исследование заброшенного замка");
//     questMap.put(5, "Охота на сокровища пиратов");