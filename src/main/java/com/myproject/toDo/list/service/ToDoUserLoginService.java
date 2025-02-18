package com.myproject.toDo.list.service;


import com.myproject.toDo.list.repository.ToDoUserLoginRepository;
import com.myproject.toDo.list.model.ToDoUserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoUserLoginService {

    @Autowired
    private ToDoUserLoginRepository toDoUserLoginRepository;

    public List<ToDoUserLogin> getAllUsers() {
        return toDoUserLoginRepository.findAll();
    }

    public ToDoUserLogin getUserById(Long id) {
        return toDoUserLoginRepository.findById(id).orElse(null);
    }

    public void saveUser(ToDoUserLogin todoUserLogin) {
        toDoUserLoginRepository.save(todoUserLogin);
    }

    public void deleteUser(Long id) {
        toDoUserLoginRepository.deleteById(id);
    }
}
