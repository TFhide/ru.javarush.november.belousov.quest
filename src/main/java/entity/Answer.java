package entity;

public class Answer {
    private Long id;
    private String text;
    private String outcome;
    private Long nextQuestionId;

    public Answer(Long id, String name, Long nextQuestionId) {
        this.id = id;
        this.text = name;
        this.nextQuestionId = nextQuestionId;
    }

    public Answer(Long id, String text, String outcome) {
        this.id = id;
        this.text = text;
        this.outcome = outcome;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Long getNextQuestionId() {
        return nextQuestionId;
    }

    public String getOutcome() {
        return outcome;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", outcome='" + outcome + '\'' +
                ", nextQuestionId=" + nextQuestionId +
                '}';
    }
}
