package com.myproject.toDo.list.service;

import com.myproject.toDo.list.model.ToDoUserLogin;
import com.myproject.toDo.list.model.ToDoUserRegister;
import com.myproject.toDo.list.repository.ToDoUserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoUserRegisterService {

    @Autowired
    private ToDoUserRegisterRepository toDoUserRegisterRepository;

    public ToDoUserRegister persist(ToDoUserRegister toDoUserRegister){
       return toDoUserRegisterRepository.save(toDoUserRegister);
    }

    public ToDoUserRegister getUserById(Long id) {
        return toDoUserRegisterRepository.findById(id).orElse(null);
    }

    public List<ToDoUserRegister> getAllToDoUserRegisters(){
        return toDoUserRegisterRepository.findAll();
    }

    public void deleteUserById(Long id) {
         toDoUserRegisterRepository.deleteById(id);
    }
}
