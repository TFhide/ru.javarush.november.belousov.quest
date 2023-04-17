package entity;

import java.util.List;

public class Question {
    private final Long id;
    private String text;
    private String questionImageLink;
    private List<Answer> answers;

    public Question(Long questionId, String questionName, String questionImageLink, List<Answer> answers) {
        this.id = questionId;
        this.text = questionName;
        this.questionImageLink = questionImageLink;
        this.answers = answers;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getQuestionImageLink() {
        return questionImageLink;
    }


    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", questionImageLink='" + questionImageLink + '\'' +
                ", answers=" + answers +
                '}';
    }
}
