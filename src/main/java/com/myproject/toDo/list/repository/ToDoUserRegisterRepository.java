package com.myproject.toDo.list.repository;

import com.myproject.toDo.list.model.ToDoUserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoUserRegisterRepository extends JpaRepository<ToDoUserRegister,Long> {
}
