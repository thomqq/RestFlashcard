package tq.arxsoft.restflashcard.controllers.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flash")
public class FlashCardRestEndPoint {

    @PostMapping(value = "new", consumes = "application/json", produces = "application/json")
    void AddNewFlashCart(@RequestBody FlashCardDto flasCard) {

    }
}
