package com.speakplusplus.vaadin8playground.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "Topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "level")
    private String level;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "tag")
    private String tag;

    @Override
    public String toString() {
        return "Topic{" +
            "id=" + id +
            ", level='" + level + '\'' +
            ", fullName='" + fullName + '\'' +
            ", tag='" + tag + '\'' +
            '}';
    }
}
