package tq.arxsoft.restflashcard.services;

import org.springframework.stereotype.Service;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;


public interface FlashCardService {
    void addNewFlashCard(FlashCardEntity flashCardEntity);
}
