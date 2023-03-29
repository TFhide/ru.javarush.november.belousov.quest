package repository;

import entity.Answer;
import entity.Quest;
import entity.Question;

import java.util.*;

public class InMemoryQuestRepository implements QuestRepository {

    private static final List<List<Quest>> quests = new ArrayList<>();
    private static final Map<Quest, Quest> ID_TO_QUEST = new HashMap<Quest, Quest>();

    static
    {
        quests = Collections.singletonList(new Quest(1L, "Потерянный артефакт темных времен", Arrays.asList(
                new Question(1L, "Ты готов отправиться в путешествие вместе с принцем Персии на поиски затерянной цитадели?",
                        "img/PrinceOfPersia/first_scene.png", Arrays.asList(new Answer(1L, "Да, я готов(а) к приключению!", 2L),
                        new Answer(2L, "Нет, я боюсь рисковать своей жизнью.", 3L))),
                new Question(2L, "Ты и принц Персии оказались в засаде. Как поступишь?", "img/PrinceOfPersia/second_scene.png",
                        Arrays.asList(new Answer(1L, "Попытаюсь отбиться от врагов.", 4L), new Answer(2L,
                                "Попытаюсь скрыться и обойти врагов.", 5L))),
                new Question(3L, "Ты подвел принца Персии, он расчитывал на твою помощь. Поражение!"),
                new Question(4L, "Вы встретили загадочного старца, который предлагает помочь вам найти цитадель. Как поступишь?",
                        "img/PrinceOfPersia/second_scene.png", Arrays.asList(new Answer(1L, "Приму помощь старца.", 6L),
                        new Answer(2L, "Откажусь от помощи и продолжу искать цитадель самостоятельно.", 7L))),
                new Question(5L, "Из-за ошибочного решения скрыться и обойти врагов," +
                        " оставив принца Персии и его воинов сражаться с врагом лицом к лицу, погибли все, включая принца Персии. Поражение!"),
                new Question(6L, "Вы прибыли к старинному храму, который, как вы думаете, может быть ключом к нахождению цитадели. " +
                        "Что будешь делать?", "img/PrinceOfPersia/second_scene.png",
                        Arrays.asList(new Answer(1L, "Исследовать храм, чтобы найти нужную информацию.", 8L),
                                new Answer(2L, "Пройти мимо храма и продолжить поиски цитадели.", 9L))),
                new Question(7L,
                        "Отказавшись от помощи старца, потеряна ценная информацию о местонахождении цитадели, войско заблудилось и погибло. Поражение!"),
                new Question(8L, "Вы нашли затерянную цитадель, но она охраняется стражами. Как действуешь?",
                        "img/PrinceOfPersia/second_scene.png", Arrays.asList(new Answer(1L, "Начну сражение со стражами.", 10L),
                        new Answer(2L, "Попробую обойти стражей и незаметно проникнуть внутрь цитадели.", 11L))),
                new Question(9L, "Упущена возможность найти ключ к нахождению цитадели. Поражение!"),
                new Question(10L,
                        "Умение действовать не только силой, но и сообразительностью, могло бы помочь достичь цели," +
                                " а не привести к погибели."),
                new Question(11L, "Попробовав незаметно проникнуть внутрь цитадели при помощи смекалки," +
                        " герой вместе с принцем Персии и его войском смогли победить стражений и разгадать тайну затерянной цитадели. Победа!"
                ))),
                new Quest(2L, "Побег из запертой комнаты", new Quest(1L,"still in work", Arrays.asList(
                        new Question(1L, "not ready",
                                "not ready", Arrays.asList(new Answer(1L, "not ready", 1L),
                                new Answer(2L, "Нет, я боюсь рисковать своей жизнью.", 1L))),
                        new Quest(3L, "Путешествие принца Персии: Легенда о затерянной цитадели",
                                new Quest(1L,"still in work", Arrays.asList(
                                        new Question(1L, "not ready",
                                                "not ready", Arrays.asList(new Answer(1L, "not ready", 1L),
                                                new Answer(2L, "Нет, я боюсь рисковать своей жизнью.", 1L)))),
                                        new Quest(4L, "Исследование заброшенного замка",
                                                new Quest(1L,"still in work", Arrays.asList(
                                                        new Question(1L, "not ready",
                                                                "not ready", Arrays.asList(new Answer(1L, "not ready", 1L),
                                                                new Answer(2L, "Нет, я боюсь рисковать своей жизнью.", 1L)))),
                                                        new Quest(5L, "Охота на сокровища пиратов",
                                                                new Quest(1L,"still in work", Arrays.asList(
                                                                        new Question(1L, "not ready",
                                                                                "not ready", Arrays.asList(new Answer(1L, "not ready", 1L),
                                                                                new Answer(2L, "Нет, я боюсь рисковать своей жизнью.", 1L)));



//still in work






                new Quest(2L, "Побег из запертой комнаты"),
                new Quest(3L, "Путешествие принца Персии: Легенда о затерянной цитадели"),
                new Quest(4L, "Исследование заброшенного замка"),
                new Quest(5L, "Охота на сокровища пиратов"));
    }

    {
//     ID_TO_QUEST.put(quests.get(3), new Quest(Collections.singletonList(new Question(1L,
//             "Ты готов отправиться в путешествие вместе с принцем Персии на поиски затерянной цитадели?",
//             "img/PrinceOfPersia/first_scene.png", Arrays.asList(new Answer(1L, "Да, я готов(а) к приключению!", 2L),
//             new Answer(2L, "Нет, я боюсь рисковать своей жизнью.", 3L))))));
//     ID_TO_QUEST.put(quests.get(3), new Quest(Collections.singletonList(new Question(2L, "Ты и принц Персии оказались в засаде. Как поступишь?",
//             "img/PrinceOfPersia/second_scene.png", Arrays.asList(new Answer(1L, "Попытаюсь отбиться от врагов.", 4L),
//             new Answer(2L, "Попытаюсь скрыться и обойти врагов.", 5L))))));
//     ID_TO_QUEST.put(quests.get(3), new Quest(new Question(3L, "Ты подвел принца Персии, он расчитывал на твою помощь. Поражение!")));
//     ID_TO_QUEST.put(quests.get(3), new Quest(Collections.singletonList(new Question(4L,
//             "Вы встретили загадочного старца, который предлагает помочь вам найти цитадель. Как поступишь?",
//                "img/PrinceOfPersia/second_scene.png", Arrays.asList(new Answer(1L, "Приму помощь старца.", 6L),
//                new Answer(2L, "Откажусь от помощи и продолжу искать цитадель самостоятельно.", 7L))))));
//     ID_TO_QUEST.put(quests.get(3), new Quest(new Question(5L, "Из-за ошибочного решения скрыться и обойти врагов," +
//                " оставив принца Персии и его воинов сражаться с врагом лицом к лицу, погибли все, включая принца Персии. Поражение!")));
//     ID_TO_QUEST.put(quests.get(3), new Quest(Collections.singletonList(new Question(6L,
//             "Вы прибыли к старинному храму, который, как вы думаете, может быть ключом к нахождению цитадели. Что будешь делать?",
//                "img/PrinceOfPersia/second_scene.png", Arrays.asList(new Answer(1L, "Исследовать храм, чтобы найти нужную информацию.", 8L),
//                new Answer(2L, "Пройти мимо храма и продолжить поиски цитадели.", 9L))))));
//     ID_TO_QUEST.put(quests.get(3), new Quest(new Question(7L,
//                "Отказавшись от помощи старца, потеряна ценная информацию о местонахождении цитадели, войско заблудилось и погибло. Поражение!")));
//     ID_TO_QUEST.put(quests.get(3), new Quest(Collections.singletonList(new Question(8L, "Вы нашли затерянную цитадель, но она охраняется стражами. Как действуешь?",
//                "img/PrinceOfPersia/second_scene.png", Arrays.asList(new Answer(1L, "Начну сражение со стражами.", 10L),
//                new Answer(2L, "Попробую обойти стражей и незаметно проникнуть внутрь цитадели.", 11L))))));
//        ID_TO_QUEST.put(quests.get(3), new Quest(new Question(9L, "Упущена возможность найти ключ к нахождению цитадели. Поражение!")));
//        ID_TO_QUEST.put(quests.get(3), new Quest(new Question(10L,
//                "Умение действовать не только силой, но и сообразительностью, могло бы помочь достичь цели, а не привести к погибели.")));
        ID_TO_QUEST.put(quests.get(3), new Quest(new Question(11L, "Попробовав незаметно проникнуть внутрь цитадели при помощи смекалки," +
                " герой вместе с принцем Персии и его войском смогли победить стражений и разгадать тайну затерянной цитадели. Победа!")));
    }

    @Override
    public List<Quest> findAllQuests()
    {
        return new ArrayList<>(quests);
    }

    @Override
    public Optional<Quest> getQuestById(Long id) {
        String result = "";
        for (Map.Entry<Quest, Quest> entry : ID_TO_QUEST.entrySet()) {
            if(entry.getKey().getId().equals(id))
            result = entry.getKey().getName();
        }
        return Optional.ofNullable(ID_TO_QUEST.get(result));
    }
}
