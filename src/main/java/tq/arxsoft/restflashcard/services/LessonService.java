package tq.arxsoft.restflashcard.services;

import tq.arxsoft.restflashcard.entities.LessonEntity;
import tq.arxsoft.restflashcard.model.FlashCard;

import java.util.List;

public interface LessonService {
    List<LessonEntity> getAllLessonForUserName(String userName);

    LessonEntity getLastLessonOrNullForUserName(String userName);

    boolean checkAnswer(FlashCard flashCard);
}
