package com.speakplusplus.vaadin8playground.controller;

import com.speakplusplus.vaadin8playground.model.Topic;
import com.speakplusplus.vaadin8playground.repo.TopicRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("choose")
@RequiredArgsConstructor
public class ChooseTopicController {

    private final TopicRepo topicRepo;

    @GetMapping("/topic")
    public String choose(Model model) {
        List<String> topics = topicRepo.findAll()
            .stream()
            .map(Topic::getFullName)
            .collect(Collectors.toList());
        model.addAttribute("topics", topics);
        return "choose_topic_page";
    }
}
