package tq.arxsoft.restflashcard.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tq.arxsoft.restflashcard.entities.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity findByName(String name);
}
