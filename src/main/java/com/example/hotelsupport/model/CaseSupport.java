package com.example.hotelsupport.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CaseSupport {
    @Id
    private long Id;
    private String issue;
    private String content;

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}