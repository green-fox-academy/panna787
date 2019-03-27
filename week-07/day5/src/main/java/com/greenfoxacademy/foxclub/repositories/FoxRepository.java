package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.data.repository.CrudRepository;

import java.util.concurrent.ThreadPoolExecutor;

public interface FoxRepository extends CrudRepository<Fox, Long> {
}
