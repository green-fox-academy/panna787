package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Query(nativeQuery = true, value="SELECT * FROM post p ORDER BY p.votes DESC LIMIT 10")
    public List<Post> findTop10Posts();
}
