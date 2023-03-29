package entity;

import java.util.List;

public class Question {
    private Long id;
    private String name;
    private String imageLink;
    private String outcome;
    private List<Answer> answers;

    public Question(Long id, String name, String imageLink, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.imageLink = imageLink;
        this.answers = answers;
    }
    public Question(Long id, String outcome) {
        this.id = id;
        this.outcome = outcome;
    }
}
