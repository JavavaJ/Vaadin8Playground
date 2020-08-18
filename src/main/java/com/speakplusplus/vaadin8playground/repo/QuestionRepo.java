package com.speakplusplus.vaadin8playground.repo;

import com.speakplusplus.vaadin8playground.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {

}
