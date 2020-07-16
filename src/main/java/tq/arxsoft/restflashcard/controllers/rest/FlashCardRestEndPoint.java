package tq.arxsoft.restflashcard.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tq.arxsoft.restflashcard.controllers.dtos.FlashCardDto;
import tq.arxsoft.restflashcard.controllers.mappers.FlashCardMapper;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;
import tq.arxsoft.restflashcard.services.FlashCardService;

@RestController
@RequestMapping("/flash")
public class FlashCardRestEndPoint {

    private FlashCardService flashCardService;
    private FlashCardMapper flashCardMapper;

    @Autowired
    public FlashCardRestEndPoint(FlashCardService flashCardService, FlashCardMapper flashCardMapper) {
        this.flashCardService = flashCardService;
        this.flashCardMapper = flashCardMapper;
    }

    @PostMapping(value = "new", consumes = "application/json", produces = "application/json")
    void AddNewFlashCart(@RequestBody FlashCardDto flashCard) {

        FlashCardEntity flashCardEntity = flashCardMapper.flashCardToEntity(flashCard);
        flashCardService.addNewFlashCard(flashCardEntity);
    }
}
