package tq.arxsoft.restflashcard.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlashCard {
    private long id;
    private String question;
    private String answer;
}
