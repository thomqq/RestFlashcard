package tq.arxsoft.restflashcard.controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlashCardDto {
    private long id;
    private String question;
    private String answer;
}
