package com.greenfoxacademy.rest.repositories;

import com.greenfoxacademy.rest.models.Log;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Log, Long>{
}
