DROP TABLE IF EXISTS Topics;

CREATE TABLE Topics (
    id IDENTITY PRIMARY KEY,
    level VARCHAR(255),
    full_name VARCHAR(255),
    tag VARCHAR(255)
);

INSERT INTO Topics (id, level, full_name, tag) VALUES (1, 'A1', 'present simple', 'present_simple');
INSERT INTO Topics (id, level, full_name, tag) VALUES (2, 'A1', 'past simple', 'past_simple');
INSERT INTO Topics (id, level, full_name, tag) VALUES (3, 'A1', 'present continuous', 'pres_cont');
INSERT INTO Topics (id, level, full_name, tag) VALUES (4, 'A1', 'was / were', 'was_were');
INSERT INTO Topics (id, level, full_name, tag) VALUES (5, 'A1', 'can / could', 'can_could');
INSERT INTO Topics (id, level, full_name, tag) VALUES (6, 'A1', 'possessives', 'possessives');
INSERT INTO Topics (id, level, full_name, tag) VALUES (7, 'A1', 'obj pronoun', 'obj_pron');
INSERT INTO Topics (id, level, full_name, tag) VALUES (8, 'A1', 'time words', 'time_word');
INSERT INTO Topics (id, level, full_name, tag) VALUES (9, 'A1', 'question words', 'question_word');
INSERT INTO Topics (id, level, full_name, tag) VALUES (10, 'A1', 'vocabulary', 'voc');
INSERT INTO Topics (id, level, full_name, tag) VALUES (11, 'A1', 'articles', 'articles');
INSERT INTO Topics (id, level, full_name, tag) VALUES (12, 'A1', 'there is', 'there_is');
INSERT INTO Topics (id, level, full_name, tag) VALUES (13, 'A1', 'some / any', 'some_any');
INSERT INTO Topics (id, level, full_name, tag) VALUES (14, 'A1', 'much / many', 'much_many');
INSERT INTO Topics (id, level, full_name, tag) VALUES (15, 'A1', 'these / those', 'these_those');
INSERT INTO Topics (id, level, full_name, tag) VALUES (16, 'A1', 'conjunctions', 'conj');
INSERT INTO Topics (id, level, full_name, tag) VALUES (17, 'A1', 'prepositions', 'preposition');
INSERT INTO Topics (id, level, full_name, tag) VALUES (18, 'A1', 'to be', 'to_be');
INSERT INTO Topics (id, level, full_name, tag) VALUES (19, 'A1', 'ordinals', 'ordinals');
INSERT INTO Topics (id, level, full_name, tag) VALUES (20, 'A1', 'numbers', 'numbers');
INSERT INTO Topics (id, level, full_name, tag) VALUES (21, 'A1', 'would like', 'would_like');
INSERT INTO Topics (id, level, full_name, tag) VALUES (22, 'A1', 'like doing', 'like_doing');
INSERT INTO Topics (id, level, full_name, tag) VALUES (23, 'A2', 'adverbs', 'adverb');
INSERT INTO Topics (id, level, full_name, tag) VALUES (24, 'A2', 'adj ed / ing', 'adj_ed_ing');
INSERT INTO Topics (id, level, full_name, tag) VALUES (25, 'A2', 'comparatives', 'compar');
INSERT INTO Topics (id, level, full_name, tag) VALUES (26, 'A2', 'present perfect', 'present_perfect');
INSERT INTO Topics (id, level, full_name, tag) VALUES (27, 'A2', 'future simple', 'fut_simple');
INSERT INTO Topics (id, level, full_name, tag) VALUES (28, 'A2', 'is going to', 'is_going_to');
INSERT INTO Topics (id, level, full_name, tag) VALUES (29, 'A2', 'my / mine', 'my_mine');
INSERT INTO Topics (id, level, full_name, tag) VALUES (30, 'A2', 'infinitive', 'infin');
INSERT INTO Topics (id, level, full_name, tag) VALUES (31, 'A2', 'have got', 'have_got');
INSERT INTO Topics (id, level, full_name, tag) VALUES (32, 'A2', 'relatives pronouns', 'rel_prons');
INSERT INTO Topics (id, level, full_name, tag) VALUES (33, 'MIX', 'passive', 'passive');
INSERT INTO Topics (id, level, full_name, tag) VALUES (34, 'MIX', 'phrasal verbs', 'phrasal_verb');
INSERT INTO Topics (id, level, full_name, tag) VALUES (35, 'MIX', 'undefined', 'undefined');
INSERT INTO Topics (id, level, full_name, tag) VALUES (36, 'B1', 'passive', 'passive');
INSERT INTO Topics (id, level, full_name, tag) VALUES (37, 'A2', 'present cont for future', 'pres_cont_fut');
