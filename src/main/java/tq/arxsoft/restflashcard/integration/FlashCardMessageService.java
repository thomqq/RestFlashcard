package tq.arxsoft.restflashcard.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.transformer.GenericTransformer;
import org.springframework.messaging.MessageHandler;
import tq.arxsoft.restflashcard.controllers.dtos.FlashCardDto;

@MessageEndpoint
public class FlashCardMessageService {

    @Bean
    @ServiceActivator(inputChannel = "flashcard")
    MessageHandler addFlashCard() {
        return message -> {
            System.out.println("headers: " + message.getHeaders());
            System.out.println("payload: " + message.getPayload());
        };
    }

    @Bean
    @Transformer(inputChannel = "flashcard", outputChannel = "flashcard")
    public GenericTransformer< FlashCardDto, FlashCardDto> someTransform() {

        return card -> new FlashCardDto(card.getId(), "TQ: " + card.getQuestion(), "TQ: " + card.getAnswer());
    }

}
