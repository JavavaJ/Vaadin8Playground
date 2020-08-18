package com.speakplusplus.vaadin8playground.model;

import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "a")
    private String a;

    @Column(name = "b")
    private String b;

    @Column(name = "c")
    private String c;

    @Column(name = "d")
    private String d;

    @Column(name = "right_an")
    private String rightAn;

    @Column(name = "tags")
    private String tags;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getRightAn() {
        return rightAn;
    }

    public void setRightAn(String rightAn) {
        this.rightAn = rightAn;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Question{" +
            "id=" + id +
            ", question='" + question + '\'' +
            ", a='" + a + '\'' +
            ", b='" + b + '\'' +
            ", c='" + c + '\'' +
            ", d='" + d + '\'' +
            ", rightAn='" + rightAn + '\'' +
            ", tags='" + tags + '\'' +
            '}';
    }
}
