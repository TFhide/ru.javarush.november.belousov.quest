package service;

import entity.Answer;
import entity.Quest;
import entity.Question;
import org.json.simple.JSONObject;
import repository.QuestRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class QuestService {
    private final QuestRepository repository;

    public QuestService(QuestRepository repository)
    {
        this.repository = repository;
    }

    public String getDescriptionQuest()
    {
        JSONObject json = new JSONObject();
        for (Map.Entry<String, Map<String,String>> entries : repository.getDescriptionQuest().entrySet()) {
            for (Map.Entry<String,String> description : entries.getValue().entrySet()) {
                json.put("description", description.getValue());
                json.put("image", description.getKey());
            }
        }
        return json.toString();
    }

    public JSONObject getFirstQuestion()
    {
        JSONObject json = new JSONObject();
        Question question = getQuestion(1L, 1L);
        List<Answer> answers = question.getAnswers();
        String image = question.getQuestionImageLink();
        json.put("question", question.getText());
        json.put("answer1", answers.get(0).getText());
        json.put("answer2", answers.get(1).getText());
        json.put("image", image);
        return json;
    }

    public Long getQuestionId(String questionText)
    {
        return repository.getQuestionId(questionText).get();
    }

    public Question getQuestion(Long idQuest, Long idQuestion)
    {
        for (Question question : getQuestByID(idQuest).getQuestions()) {
            if (question.getId() == idQuestion) {
                return question;
            }
        }
        return null; // "This question not founded"
    }

    public Object getNextQuestion(Long questId, String questionText, Long answerId)
    {
        List<Answer> answers = getQuestion(questId, getQuestionId(questionText)).getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).getId() == answerId) {
                if (Objects.nonNull(answers.get(i).getOutcome())) {
                    return answers.get(i).getOutcome();
                }
                else {
                    return getQuestion(questId, answers.get(i).getNextQuestionId());
                }
            } else {
                return (Object) answers.get(i + 1).getOutcome();
            }
        }
        return null;
        }

    public boolean checkResultOnTrueOrFalse(Object value)
    {
         if (value instanceof Question) {
             return true;
         }
         return false;
    }

    public JSONObject getJsonContainer(HttpServletRequest request)
    {
        JSONObject json = new JSONObject();
        boolean checkResult = checkResultOnTrueOrFalse(getNextQuestion(1L,
                request.getParameter("question"), Long.parseLong(request.getParameter("answer"))));
        if (checkResult) {
            Question question = (Question) getNextQuestion(1L,
                    request.getParameter("question"), Long.parseLong(request.getParameter("answer")));
            json.put("question", question.getText());
            json.put("answer1", question.getAnswers().get(0).getText());
            json.put("answer2", question.getAnswers().get(1).getText());
            json.put("image", question.getQuestionImageLink());
            return json;
        }
        else {
            String outcome = (String) getNextQuestion(1L,
                    request.getParameter("question"), Long.parseLong(request.getParameter("answer")));
            json.put("outcome", outcome);
        }
        return json;
    }
        public Quest getQuestByID(Long id)
    {
        Optional<Quest> quest = repository.getQuestById(id);
        return quest.get();
    }

}