package tq.arxsoft.restflashcard.integration.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;
import tq.arxsoft.restflashcard.controllers.dtos.FlashCardDto;

@Component
@MessagingGateway(defaultRequestChannel = "flashcard")
public interface FlashCardGateway {
    void addFlashCard(FlashCardDto flashCardDto);
}
