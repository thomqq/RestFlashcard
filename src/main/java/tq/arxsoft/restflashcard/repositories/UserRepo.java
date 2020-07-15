package tq.arxsoft.restflashcard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tq.arxsoft.restflashcard.entities.UserEntity;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByName(String name);
}
