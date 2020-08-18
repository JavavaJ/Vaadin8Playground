package com.speakplusplus.vaadin8playground.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@SpringUI
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MyUI extends UI {

    private VerticalLayout root;

    @Autowired
    private QuestionsLayout questionsLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addLabel();
        addQuestions();
    }

    private void addQuestions() {
        root.addComponent(questionsLayout);
    }

    private void setupLayout() {
        root = new VerticalLayout();
        root.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(root);
    }

    private void addLabel() {
        Label label = new Label("Questions");
        label.addStyleName(ValoTheme.LABEL_H1);
        root.addComponent(label);
    }
}
