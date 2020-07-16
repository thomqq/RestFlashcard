package tq.arxsoft.restflashcard.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlashCard {
    private long id;
    private String question;
    private String answer;
}
