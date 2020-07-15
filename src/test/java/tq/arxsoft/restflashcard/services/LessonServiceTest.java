package tq.arxsoft.restflashcard.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import tq.arxsoft.restflashcard.controllers.repositories.LessonRepo;
import tq.arxsoft.restflashcard.entities.LessonEntity;
import tq.arxsoft.restflashcard.model.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestPropertySource(locations = "/test.properties")
@DataJpaTest
class LessonServiceTest {

    @Autowired
    LessonRepo lessonRepo;

    @Test
    void get_all_lesson_for_user() {
        //given
        User user = new User("thomqq");
        LessonService lessonService = new LessonService(lessonRepo);
        //when
        List<LessonEntity> lessons = lessonService.getAllLesson(user);
        //then
        assertEquals(false, lessons.isEmpty());
    }
}