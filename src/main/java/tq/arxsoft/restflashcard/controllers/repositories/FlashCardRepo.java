package tq.arxsoft.restflashcard.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;

@Repository
public interface FlashCardRepo extends JpaRepository<FlashCardEntity, Long> {
}
