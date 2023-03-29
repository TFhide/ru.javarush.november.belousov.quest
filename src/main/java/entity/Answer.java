package entity;

import java.util.List;

public class Answer {
    private Long id;
    private String name;
    private Long nextQuestionId;

    public Answer(Long id, String name, Long nextQuestionId) {
        this.id = id;
        this.name = name;
        this.nextQuestionId = nextQuestionId;
    }

}
