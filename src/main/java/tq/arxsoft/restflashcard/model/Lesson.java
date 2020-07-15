package tq.arxsoft.restflashcard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;

import java.util.List;

@Data
@AllArgsConstructor
public class Lesson {
    private String name;
    private List<FlashCardEntity> flashCards;
}
