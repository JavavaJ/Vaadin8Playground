package com.speakplusplus.vaadin8playground.repo;

import com.speakplusplus.vaadin8playground.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepo extends JpaRepository<Topic, Long> {

    Topic findTopicByFullName(String fullName);
}
