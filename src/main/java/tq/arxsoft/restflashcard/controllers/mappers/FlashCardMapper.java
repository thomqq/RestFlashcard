package tq.arxsoft.restflashcard.controllers.mappers;

import org.mapstruct.Mapper;
import tq.arxsoft.restflashcard.controllers.dtos.FlashCardDto;
import tq.arxsoft.restflashcard.entities.FlashCardEntity;
import tq.arxsoft.restflashcard.model.FlashCard;

@Mapper(componentModel = "spring")
public interface FlashCardMapper {

    //FlashCardMapper INSTANCE = Mappers.getMapper( FlashCardMapper.class );

    FlashCardEntity flashCardToEntity(FlashCardDto flashCardDto);
    FlashCardDto flashCardToDto( FlashCardEntity flashCardEntity);
    FlashCard flashCardEntityToFlasCard( FlashCardEntity flashCardEntity );
}
