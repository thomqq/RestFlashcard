package tq.arxsoft.restflashcard.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flashcards")
public class FlashCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String answer;

    private Date timestamp;

    private Long rightAnswers;
    private Long wrongAnswers;

    public FlashCardEntity(int id, String question, String answer) {
        this.timestamp = new Date(new java.util.Date().getTime());
        this.rightAnswers = 0l;
        this.wrongAnswers = 0l;
    }
}
