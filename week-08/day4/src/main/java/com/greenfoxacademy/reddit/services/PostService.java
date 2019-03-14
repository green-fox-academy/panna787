package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public void upvotePost(Long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.increaseVotes();
            //TODO: remove code duplication
            postRepository.save(post);
        }
    }

    public void downvotePost(Long id){
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.decreaseVotes();
            postRepository.save(post);
        }
    }

    public Iterable<Post> getAllPost(){
        return postRepository.findAll();
    }
}
