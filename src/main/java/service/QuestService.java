package service;

import entity.Answer;
import entity.Quest;
import entity.Question;
import org.json.simple.JSONObject;
import repository.QuestRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class QuestService {
    private final QuestRepository repository;

    public QuestService(QuestRepository repository)
    {
        this.repository = repository;
    }


    public Quest getQuestByID(Long id)
    {
        Optional<Quest> quest = repository.getQuestById(id);
        return quest.get();
    }

    public List<Quest> findAllQuests()
    {
        return repository.findAllQuests();
    }

    public String getDescriptionQuest()
    {
        String description = repository.getDescriptionQuest().get(0);
        return description;
    }

    public Question getQuestion(Long idQuest, Long idQuestion)
    {
        Optional<Quest> quests = repository.getQuestById(idQuest);
        List<Question> questions = quests.get().getQuestions();
        for (Question question : questions) {
            if (question.getId() == idQuestion) {
                return question;
            }
        }
        return null; // "This question not founded"
    }

    public List<Answer> getAnswers(Long idQuest, Long idQuestion)
    {
        return getQuestion(idQuest, idQuestion).getAnswers();
    }

    public String getAnswerForOutcome(Long idQuest, Long idQuestion, Long answerId)
    {
        for (Answer answer : getAnswers(idQuest, idQuestion)) {
            if (answer.getId() == answerId) {
                return answer.getOutcome();
            }
        }
        return null;
    }

    public JSONObject getQuestionContainer(Long questId, Long questionId, Long answerId)
    {
        JSONObject json = new JSONObject();
        List<Answer> answers = getQuestion(questId, questionId).getAnswers();
        for (Answer answer : answers) {
//            if (answer.getId() == answerId) {
//                Question question = getQuestion(questId, answer.getNextQuestionId());
//                json.put("question", question);
//                json.put("answers", getAnswers(questId, answer.getNextQuestionId()));
//            }
//            else {
//                json.put("outcome",answer.getOutcome());
//            }
//            return json;
//        }
//        return json;
            Question question = getQuestion(questId, answer.getNextQuestionId());
            json.put("question", question);
            json.put("answers", getAnswers(questId, answer.getNextQuestionId()));
        }
            return json;
    }

    public boolean checkContentJsonObject(JSONObject json)
    {
        return json.containsKey("outcome");
    }

}