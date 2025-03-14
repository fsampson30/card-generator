package com.sampson.card_generator.domain.model;

import java.time.LocalDateTime;

public class Card {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime endDate;
    private boolean situation;


    public Card(Long id, String title, String description, LocalDateTime creationDate, LocalDateTime endDate, boolean situation) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.endDate = endDate;
        this.situation = situation;
    }

    public Card() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isSituation() {
        return situation;
    }

    public void setSituation(boolean situation) {
        this.situation = situation;
    }
}
