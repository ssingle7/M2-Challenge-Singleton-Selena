package com.cognizant.magicapi.model;

public class Answer {
    private String answerText;
    private Integer id;
    private String question;


    public Answer(String answerText, Integer id, String question) {
        this.answerText = answerText;
        this.id = id;
        this.question = question;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
