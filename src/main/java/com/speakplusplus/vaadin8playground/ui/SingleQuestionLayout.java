package com.speakplusplus.vaadin8playground.ui;

import com.speakplusplus.vaadin8playground.model.Question;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.RadioButtonGroup;
import com.vaadin.ui.themes.ValoTheme;

public class SingleQuestionLayout extends HorizontalLayout {

    private final RadioButtonGroup<String> group;

    public SingleQuestionLayout(Question question) {

        StringBuilder radioTextSb = new StringBuilder()
            .append(question.getId())
            .append(". ")
            .append(question.getQuestion());
        group = new RadioButtonGroup<>(radioTextSb.toString());

        group.setItems(
            question.getA(),
            question.getB(),
            question.getC(),
            question.getD()
        );

        group.addStyleName(ValoTheme.LABEL_H2);

        addComponent(group);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
    }
}
