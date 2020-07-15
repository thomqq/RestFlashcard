package tq.arxsoft.restflashcard.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LessonWebController {

    @GetMapping("lessons")
    ModelAndView showLessonPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lessons");

        return modelAndView;
    }

}
