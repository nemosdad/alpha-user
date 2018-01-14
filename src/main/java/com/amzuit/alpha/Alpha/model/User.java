package com.amzuit.alpha.Alpha.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class User {

    private long id;
    @NotNull
    private String firstName;
    @NotNull
    private String surName;
    private String nickName;
    @NotNull
    private String email;
    @NotNull
    private String passWord;
    private Date createdOn;
    private Date modifiedOn;

    @PostPersist
    public void postPersist() {
        createdOn = modifiedOn = new Date();
    }

    @PostUpdate
    public void postUpdate() {
        modifiedOn = new Date();
    }
}
