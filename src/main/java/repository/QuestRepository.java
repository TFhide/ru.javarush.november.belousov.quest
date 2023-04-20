package repository;

import entity.Quest;


import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface QuestRepository {
     Optional<Quest> getQuestById(Long id);

     Map<String, Map<String,String>> getDescriptionQuest();

     Optional<Long> getQuestionId(String questionText);


}
