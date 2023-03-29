package entity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Quest {
    private Long id;
    private String name;
    private List<Question> questions;

    private Long startQuestionId;

    public Quest(Long id, String name, List<Question> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
    }

    public Quest(Long startQuestionId) {
        this.startQuestionId = startQuestionId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Quest quest = (Quest) o;
        return Objects.equals(id, quest.id)
                && Objects.equals(name, quest.name)
                && Objects.equals(questions, quest.questions)
                && Objects.equals(startQuestionId, quest.startQuestionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, questions, startQuestionId);
    }
}
