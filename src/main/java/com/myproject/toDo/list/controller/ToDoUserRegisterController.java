package com.myproject.toDo.list.controller;

import com.myproject.toDo.list.model.ToDoUserLogin;
import com.myproject.toDo.list.model.ToDoUserRegister;
import com.myproject.toDo.list.service.ToDoUserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static javax.net.ssl.SSLEngineResult.Status.OK;

@RestController
@RequestMapping("/signUp")
public class ToDoUserRegisterController {

    @Autowired
    private ToDoUserRegisterService toDoUserRegisterService;

    @GetMapping("/")
    ResponseEntity<List<ToDoUserRegister>> getAllToDoUserRegister(){
        List<ToDoUserRegister> toDoUserRegisters= toDoUserRegisterService.getAllToDoUserRegisters();
        return new ResponseEntity<>(toDoUserRegisters, HttpStatus.OK);
    }

    @PostMapping("/save")
    ResponseEntity<ToDoUserRegister> persistToDoUserRegister(@RequestBody ToDoUserRegister toDoUserRegister){
        ToDoUserRegister savedToDoUserRegister=  toDoUserRegisterService.persist(toDoUserRegister);
        return new ResponseEntity<>(savedToDoUserRegister,HttpStatus.CREATED);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long mobileNumber) {
        toDoUserRegisterService.deleteUserById(mobileNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
