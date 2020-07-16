package tq.arxsoft.restflashcard.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tq.arxsoft.restflashcard.controllers.mappers.FlashCardMapper;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;
import tq.arxsoft.restflashcard.entities.LessonEntity;
import tq.arxsoft.restflashcard.model.FlashCard;
import tq.arxsoft.restflashcard.model.User;
import tq.arxsoft.restflashcard.services.LessonService;

import java.util.List;

@Controller
public class LessonWebController {

    private LessonService lessonService;
    private User user;
    private FlashCardMapper flashCardMapper;

    @Autowired
    public LessonWebController(LessonService lessonService, User user, FlashCardMapper flashCardMapper) {
        this.lessonService = lessonService;
        this.user = user;
        this.flashCardMapper = flashCardMapper;
    }

    @RequestMapping("lessons")
    ModelAndView showLessonPage() {

        LessonEntity lesson = lessonService.getLastLessonOrNullForUserName(user.getName());
        if (lesson == null) {
            List<LessonEntity> lessons = lessonService.getAllLessonForUserName(user.getName());
            lesson = (lessons == null || lessons.isEmpty()) ? null : lessons.get(0);
        }


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lessons");

        FlashCardEntity flashCardEntity = lesson.getFlashCards().get(0);
        FlashCard flashCard = flashCardMapper.flashCardEntityToFlasCard(flashCardEntity);
        flashCard.setAnswer("");

        modelAndView.addObject("flashCard", lesson.getFlashCards().get(0));
        //modelAndView.addObject("flashCard", new FlashCard(1, "Jaka dzisiaj jest pogoda?", "" /*""What's the weather like today?"*/));

        return modelAndView;
    }

    @RequestMapping("answer")
    String answerPage(@ModelAttribute FlashCard flashCard) {
        System.out.println(flashCard.getAnswer());
        return "redirect:lessons";
    }

}
