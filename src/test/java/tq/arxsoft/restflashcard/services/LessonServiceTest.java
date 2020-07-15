package tq.arxsoft.restflashcard.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import tq.arxsoft.restflashcard.repositories.LessonRepo;
import tq.arxsoft.restflashcard.repositories.UserRepo;
import tq.arxsoft.restflashcard.entities.LessonEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestPropertySource(locations = "/test.properties")
@DataJpaTest
class LessonServiceTest {

    @Autowired
    LessonRepo lessonRepo;

    @Autowired
    UserRepo userRepo;

    @Test
    void get_all_lesson_for_user() {
        //given
        LessonService lessonService = new LessonService(lessonRepo, userRepo);
        //when
        List<LessonEntity> lessons = lessonService.getAllLessonForUserName("thomqq");
        //then
        assertEquals(false, lessons.isEmpty());
    }

    @Test
    void get_last_lesson_for_user_or_null() {
        //given
        LessonService lessonService = new LessonService(lessonRepo, userRepo);
        //when
        LessonEntity lessonEntity = lessonService.getLastLessonOrNullForUserName("thomqq");
        //then
        assertNotNull(lessonEntity);
    }
}