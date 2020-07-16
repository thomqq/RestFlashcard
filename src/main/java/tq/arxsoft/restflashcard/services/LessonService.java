package tq.arxsoft.restflashcard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tq.arxsoft.restflashcard.repositories.LessonRepo;
import tq.arxsoft.restflashcard.repositories.UserRepo;
import tq.arxsoft.restflashcard.entities.LessonEntity;
import tq.arxsoft.restflashcard.entities.UserEntity;

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
        UserEntity userEntity = userRepo.findByName(userName).orElse(null);
        return userEntity.getLessons();
    }

    public LessonEntity getLastLessonOrNullForUserName(String userName) {
        UserEntity userEntity = userRepo.findByName(userName).orElse(null);
        if( userEntity == null || userEntity.getLastLessonId() < 1 ) {
            return null;
        }

        return lessonRepo.findById(userEntity.getLastLessonId()).orElse(null);
    }
}
