package com.greenfoxacademy.connectwithmysql.models;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
