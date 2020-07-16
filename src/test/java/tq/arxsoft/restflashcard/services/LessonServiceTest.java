package tq.arxsoft.restflashcard.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;
import tq.arxsoft.restflashcard.model.FlashCard;
import tq.arxsoft.restflashcard.repositories.FlashCardRepo;
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

    @Autowired
    FlashCardRepo flashCardRepo;

    private LessonService lessonService;

    @BeforeEach
    void init() {
        lessonService = new LessonService(lessonRepo, userRepo,flashCardRepo );
    }

    @Test
    void get_all_lesson_for_user() {
        //given
        //when
        List<LessonEntity> lessons = lessonService.getAllLessonForUserName("thomqq");
        //then
        assertFalse(lessons.isEmpty());
    }

    @Test
    void get_last_lesson_for_user_or_null() {
        //given
        //when
        LessonEntity lessonEntity = lessonService.getLastLessonOrNullForUserName("thomqq");
        //then
        assertNotNull(lessonEntity);
    }

    @Test
    void confirm_right_if_answer_is_correct() {
        //given
        //when
        FlashCard flashCard = new FlashCard(1, "q1", "a1");
        boolean result = lessonService.checkAnswer(flashCard);
        //then
        assertTrue(result);
    }
}