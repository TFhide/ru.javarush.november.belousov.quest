package service;

import entity.Answer;
import entity.Quest;
import entity.Question;
import org.json.simple.JSONObject;
import repository.QuestRepository;

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
        JSONObject json = new JSONObject();
        for (Map.Entry<String, Map<String,String>> entries : repository.getDescriptionQuest().entrySet()) {
            for (Map.Entry<String,String> description : entries.getValue().entrySet()) {
                json.put("description", description.getValue());
                json.put("image", description.getKey());
            }
        }
        return json.toString();
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

    public Object getNextQuestion(Long questId, String questionText, Long answerId)
    {
//        System.out.println("GETNEXTQUESTIONquestionText = " + questionText);
//        System.out.println("GETNEXTQUESTIONanswerText = " +  answerId);
        List<Answer> answers = getQuestion(questId, getQuestionId(questionText)).getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).getId() == answerId) {
                if (Objects.nonNull(answers.get(i).getOutcome())) {
//                    System.out.println("answers.get(i).getOutcome()= " + answers.get(i).getOutcome());
                    return answers.get(i).getOutcome();
                }
                else {
                    return getQuestion(questId, answers.get(i).getNextQuestionId());
                }
//                System.out.println("answer text = " + answers.get(i).getText() + " answer id = " + answers.get(i).getId() +
//                        " answers nextQuestion = " + answers.get(i).getNextQuestionId());
            } else {
//                System.out.println("answer text = " + answers.get(i).getText() + " answer id = " + answers.get(i).getId() +
//                        " answers outcome = " + answers.get(i).getOutcome());
                return (Object) answers.get(i + 1).getOutcome();
            }
        }
//        };
//        for (Answer answer : getQuestion(questId, questionId).getAnswers()) {
//            if (answer.getId() == answerId) {
////                System.out.println("answer " + answer.getId() + " inputAnswerId " + answerId);
////                Question nextQuestion = getQuestion(questId, answer.getNextQuestionId());
////                System.out.println("getNextQuestion" +  nextQuestion.getText());
////                return (T) nextQuestion;
//            }
//            if (answer.getId() + 1 == answerId && Objects.isNull(answer.getOutcome())) {
////                System.out.println("answer " + answer.getId() + " inputAnswerId " + answerId);
////                System.out.println("getNextQuestion-outcome " + answer.getOutcome());
//                return (T) answer.getOutcome();
//            }
////            else {
////                System.out.println("getNextQuestion-outcome " + answer.getOutcome());
////            }
////                System.out.println("getNextQuestion-outcome " + answer.getOutcome());
////                return (T) answer.getOutcome();
//        }
//        return null;  // обработать
//    }
        return null;
        }

    public boolean checkResultOnTrueOrFalse(Object value)
    {
         if (value instanceof Question) {
             return true;
         }
         return false;
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
//        System.out.println(json);
        return json;
    }


    public Long getQuestionId(String questionText)
    {
//        System.out.println("getQuestionIDText= " + repository.getQuestionId(questionText));
        return repository.getQuestionId(questionText);
    }

//    public String getOutcomeOfQuestion(List<Answer> answers)
//    {
//
//
//    }


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