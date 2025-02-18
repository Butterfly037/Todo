package com.myproject.toDo.list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ToDoUserLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private Long mobileNUmber;
    private String password;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Long getMobileNUmber() {
        return mobileNUmber;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMobileNUmber(Long mobileNUmber) {
        this.mobileNUmber = mobileNUmber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
