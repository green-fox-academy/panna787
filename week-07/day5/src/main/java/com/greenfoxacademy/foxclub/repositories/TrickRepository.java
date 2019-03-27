package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Trick;
import org.springframework.data.repository.CrudRepository;

public interface TrickRepository extends CrudRepository<Trick, Long> {

    Trick findByDescription(String description);
}
