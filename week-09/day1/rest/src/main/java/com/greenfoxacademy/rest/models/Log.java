package com.greenfoxacademy.rest.models;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.Date;


@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    private String endpoint;
    private String data;

    public Log(String endpoint, String data) {
        this.createdAt = new Date();
        this.endpoint = endpoint;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
