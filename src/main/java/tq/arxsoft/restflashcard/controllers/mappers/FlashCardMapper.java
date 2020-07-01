package tq.arxsoft.restflashcard.controllers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import tq.arxsoft.restflashcard.controllers.dtos.FlashCardDto;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;

@Mapper(componentModel = "spring")
public interface FlashCardMapper {
    FlashCardEntity flashCardToEntity(FlashCardDto flashCardDto);
}
