package com.speakplusplus.vaadin8playground.ui;

import com.speakplusplus.vaadin8playground.model.Topic;
import com.speakplusplus.vaadin8playground.repo.TopicRepo;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@SpringUI
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MyUI extends UI {

    private VerticalLayout root;

    private NativeSelect<String> tagSelector;

    @Autowired
    private QuestionsLayout questionsLayout;

    @Autowired
    private TopicRepo topicRepo;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addLabel();
        addSelect();
        addInitialQuestions();
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

    private void addSelect() {
        tagSelector = new NativeSelect<>("Choose Tag");
        tagSelector.setEmptySelectionAllowed(false);
        List<Topic> topics = new ArrayList<>(topicRepo.findAll());
        tagSelector.setItems(topics.stream().map(Topic::getFullName));
        tagSelector.setValue(topics.get(0).getFullName());
        tagSelector.addValueChangeListener(e -> {
            Topic selectedTopic = topicRepo.findTopicByFullName(e.getValue());
            addQuestionsByTopic(selectedTopic);
        });
        root.addComponent(tagSelector);
    }

    private void addQuestionsByTopic(Topic topic) {
        questionsLayout.setQuestionsByTopic(topic);
        root.addComponent(questionsLayout);
    }

    private void addInitialQuestions() {
        questionsLayout.clear();
        root.addComponent(questionsLayout);
    }

}
