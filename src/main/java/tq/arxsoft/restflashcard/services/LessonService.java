package tq.arxsoft.restflashcard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tq.arxsoft.restflashcard.controllers.repositories.LessonRepo;
import tq.arxsoft.restflashcard.controllers.repositories.UserRepo;
import tq.arxsoft.restflashcard.entities.LessonEntity;
import tq.arxsoft.restflashcard.entities.UserEntity;
import tq.arxsoft.restflashcard.model.Lesson;
import tq.arxsoft.restflashcard.model.User;

import java.util.List;

@Service
public class LessonService {

    private LessonRepo lessonRepo;
    private UserRepo userRepo;

    @Autowired
    public LessonService(LessonRepo lessonRepo,  UserRepo userRepo) {
        this.lessonRepo = lessonRepo;
        this.userRepo = userRepo;
    }

    public List<LessonEntity> getAllLessonForUserName(String userName) {
        UserEntity userEntity = userRepo.findByName(userName);
        return userEntity.getLessons();
    }
}
