package com.speakplusplus.vaadin8playground.repo;

import com.speakplusplus.vaadin8playground.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {

    List<Question> findQuestionsByTags(String tag);
}
