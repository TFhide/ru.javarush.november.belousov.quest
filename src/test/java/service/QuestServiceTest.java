package service;

import entity.Answer;
import entity.Quest;
import entity.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class QuestServiceTest {

//    private QuestService questService;
//
//    @BeforeEach
//    void setUp() {
//        // создание тестовых данных
//        List<Quest> quests = new ArrayList<>();
//        quests.add(new Quest(1L, "Путешествие принца Персии: Легенда о затерянной цитадели", Arrays.asList(
//                new Question(1L, "Ты готов отправиться в путешествие вместе с принцем Персии на поиски затерянной цитадели?",
//                        "img/PrinceOfPersia/first_scene.png", Arrays.asList(new Answer(1L, "Да, я готов(а) к приключению!", 2L),
//                        new Answer(2L, "Нет, я боюсь рисковать своей жизнью.",
//                                "Ты подвел принца Персии, он расчитывал на твою помощь. Поражение!"))))));
//
//    }
//    @Test
//    void getDescriptionQuest() {
//
//    }
//
//    @Test
//    void getFirstQuestion() {
//    }
//
//    @Test
//    void getQuestionId() {
//    }
//
//    @Test
//    void getQuestion() {
//    }
//
//    @Test
//    void getNextQuestion() {
//    }
//
//    @Test
//    void checkResultOnTrueOrFalse() {
//    }
//
//    @Test
//    void getJsonContainer() {
//    }
//
//    @Test
//    void getQuestByID() {
//        List<Quest> quests = new ArrayList<>();
//        quests.add(new Quest(1L, "Путешествие принца Персии: Легенда о затерянной цитадели", Arrays.asList(
//                new Question(1L, "Ты готов отправиться в путешествие вместе с принцем Персии на поиски затерянной цитадели?",
//                        "img/PrinceOfPersia/first_scene.png", Arrays.asList(new Answer(1L, "Да, я готов(а) к приключению!", 2L),
//                        new Answer(2L, "Нет, я боюсь рисковать своей жизнью.",
//                                "Ты подвел принца Персии, он расчитывал на твою помощь. Поражение!"))))));
//        // создаем заглушку для ID_TO_QUEST
//        Map<Long, Quest> ID_TO_QUEST = new HashMap<>();
//        ID_TO_QUEST.put(1L, quests.get(0));
//
//        // создаем экземпляр класса, который будем тестировать
//        QuestService questService = new QuestService(quests, ID_TO_QUEST);
//
//        // создаем заглушку для Long id
//        Long id = 1L;
//
//        // вызываем метод getQuestById
//        Optional<Quest> result = questService.getQuestById(id);
//
//        // проверяем, что результат не пустой и соответствует ожидаемому
//        assertTrue(result.isPresent());
//        assertEquals(quests.get(0), result.get());
//    }
    }
