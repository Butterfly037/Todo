package com.myproject.toDo.list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NonNull;

@Entity(name = "ToDo_User_Registration")
public class ToDoUserRegister {

    private String userName;
    private String password;
    @NonNull
    private String mailId;
    @Id
    private Long phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
