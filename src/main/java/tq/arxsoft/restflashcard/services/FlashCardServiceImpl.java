package tq.arxsoft.restflashcard.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import tq.arxsoft.restflashcard.controllers.repositories.FlashCardRepo;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;

import javax.transaction.Transactional;

@Service
@Data
@AllArgsConstructor
@Transactional
public class FlashCardServiceImpl implements FlashCardService {

    private FlashCardRepo flashCardRepo;

    @Override
    public void addNewFlashCard(FlashCardEntity flashCardEntity) {
        flashCardRepo.save(flashCardEntity);
    }
}
