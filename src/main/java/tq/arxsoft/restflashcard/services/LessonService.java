package tq.arxsoft.restflashcard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tq.arxsoft.restflashcard.controllers.repositories.LessonRepo;
import tq.arxsoft.restflashcard.entities.LessonEntity;
import tq.arxsoft.restflashcard.model.Lesson;
import tq.arxsoft.restflashcard.model.User;

import java.util.List;

@Service
public class LessonService {

    private LessonRepo lessonRepo;

    @Autowired
    public LessonService(LessonRepo lessonRepo) {
        this.lessonRepo = lessonRepo;
    }

    public List<LessonEntity> getAllLesson(User user) {
        return lessonRepo.findAll();
    }
}
