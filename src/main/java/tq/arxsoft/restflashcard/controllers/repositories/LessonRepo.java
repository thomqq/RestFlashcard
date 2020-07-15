package tq.arxsoft.restflashcard.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tq.arxsoft.restflashcard.entities.LessonEntity;

public interface LessonRepo extends JpaRepository<LessonEntity, Long> {
}
