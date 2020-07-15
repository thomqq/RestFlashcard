package tq.arxsoft.restflashcard.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tq.arxsoft.restflashcard.controllers.dtos.FlashCardDto;
import tq.arxsoft.restflashcard.controllers.mappers.FlashCardMapper;
import tq.arxsoft.restflashcard.repositories.FlashCardRepo;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;
import tq.arxsoft.restflashcard.integration.gateway.FlashCardGateway;

import javax.transaction.Transactional;

@Service
@Data
@Transactional
public class FlashCardServiceImpl implements FlashCardService {

    private FlashCardRepo flashCardRepo;
    private FlashCardGateway gateway;
    private FlashCardMapper flashCardMapper;

    @Autowired
    public FlashCardServiceImpl(FlashCardRepo flashCardRepo, FlashCardGateway gateway, FlashCardMapper flashCardMapper) {
        this.flashCardRepo = flashCardRepo;
        this.gateway = gateway;
        this.flashCardMapper = flashCardMapper;
    }

    @Override
    public void addNewFlashCard(FlashCardEntity flashCardEntity) {
        FlashCardDto flashCardDto = flashCardMapper.flashCardToDto(flashCardEntity);
        gateway.addFlashCard(flashCardDto);
        flashCardRepo.save(flashCardEntity);
    }
}
