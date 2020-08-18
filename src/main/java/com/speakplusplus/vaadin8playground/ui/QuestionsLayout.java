package com.speakplusplus.vaadin8playground.ui;

import com.speakplusplus.vaadin8playground.model.Question;
import com.speakplusplus.vaadin8playground.repo.QuestionRepo;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringComponent
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class QuestionsLayout extends VerticalLayout {

    @Autowired
    private QuestionRepo questionRepo;

    @PostConstruct
    public void init() {
        update();
    }

    private void update() {
        setQuestions(questionRepo.findAll());
    }

    private void setQuestions(List<Question> questions) {
        removeAllComponents();
        questions.forEach(question -> addComponent(new SingleQuestionLayout(question)));
    }
}
