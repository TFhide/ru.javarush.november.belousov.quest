package repository;

import entity.Quest;

import java.util.List;
import java.util.Optional;

public interface QuestRepository {
     List<Quest> findAllQuests();
     Optional<Quest> getQuestById(Long id);
}
