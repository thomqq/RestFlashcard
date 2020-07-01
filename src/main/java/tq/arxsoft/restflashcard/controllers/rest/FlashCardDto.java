package tq.arxsoft.restflashcard.controllers.rest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlashCardDto {
    private String question;
    private String answer;
}
