package com.myproject.toDo.list.controller;
import com.myproject.toDo.list.service.ToDoUserLoginService;
import com.myproject.toDo.list.model.ToDoUserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class ToDoUserLoginController {

    @Autowired
    private ToDoUserLoginService toDoUserLoginService;

    @GetMapping("/")
    public ResponseEntity<List<ToDoUserLogin>> getAllUsers() {
        List<ToDoUserLogin> users = toDoUserLoginService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ToDoUserLogin> getUserById(@PathVariable Long id) {
        ToDoUserLogin user = toDoUserLoginService.getUserById(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            System.out.println("test111");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<ToDoUserLogin> createUser(@RequestBody ToDoUserLogin todoUserLogin) {
        toDoUserLoginService.saveUser(todoUserLogin);
        return new ResponseEntity<>(todoUserLogin, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ToDoUserLogin> updateUser(@PathVariable Long id, @RequestBody ToDoUserLogin todoUserLogin) {
        ToDoUserLogin existingUser = toDoUserLoginService.getUserById(id);

        System.out.println("chekc :"+existingUser);
        if (existingUser != null) {
            todoUserLogin.setId(id);
            toDoUserLoginService.saveUser(todoUserLogin);
            return new ResponseEntity<>(todoUserLogin, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
        toDoUserLoginService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}