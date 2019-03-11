package com.greenfoxacademy.dbintegration.repository;

import com.greenfoxacademy.dbintegration.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
