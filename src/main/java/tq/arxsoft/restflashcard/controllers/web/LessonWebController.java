package tq.arxsoft.restflashcard.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tq.arxsoft.restflashcard.model.FlashCard;

@Controller
public class LessonWebController {

    @RequestMapping("lessons")
    ModelAndView showLessonPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lessons");

        modelAndView.addObject("flashCard", new FlashCard(1, "Jaka dzisiaj jest pogoda?", "" /*""What's the weather like today?"*/));

        return modelAndView;
    }

    @RequestMapping("answer")
    String answerPage(@ModelAttribute FlashCard flashCard) {
        System.out.println(flashCard.getAnswer());
        return "redirect:lessons";
    }

}
