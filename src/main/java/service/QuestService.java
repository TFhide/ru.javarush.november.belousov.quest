package service;

import entity.Quest;
import repository.QuestRepository;

import java.util.List;
import java.util.Optional;

public class QuestService  {
    private final QuestRepository repository;

    public QuestService(QuestRepository repository) {
        this.repository = repository;
    }

    public Quest getByID(Long id) {
        Optional<Quest> quest = repository.getQuestById(id);
        return quest.get();
    }

    public List<Quest> findAllQuests() {
        return null;
    }
}
