package com.myproject.toDo.list.repository;

import com.myproject.toDo.list.model.ToDoUserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoUserLoginRepository extends JpaRepository<ToDoUserLogin, Long> { }
