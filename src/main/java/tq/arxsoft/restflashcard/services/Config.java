package tq.arxsoft.restflashcard.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import tq.arxsoft.restflashcard.model.User;

@Configuration
public class Config {

//    @Bean
//    FlashCardMapper create() {
//        return Mappers.getMapper(FlashCardMapper.class);
//    }

    @Bean
    @SessionScope
    User setUser() {
       return new User("thomqq");
    }

}
