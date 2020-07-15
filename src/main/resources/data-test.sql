-- not empty
insert into flashcards (id, question, answer) values (1, 'q1', 'a1');
insert into flashcards (id, question, answer) values (2, 'q2', 'a2');
insert into flashcards (id, question, answer) values (3, 'q3', 'a3');

insert into lessons (id, name) values(1, 'l1');

insert into lessons_flash_cards ( lesson_entity_id, flash_cards_id) values (1, 1);
insert into lessons_flash_cards ( lesson_entity_id, flash_cards_id) values (1, 2);
insert into lessons_flash_cards ( lesson_entity_id, flash_cards_id) values (1, 3);


