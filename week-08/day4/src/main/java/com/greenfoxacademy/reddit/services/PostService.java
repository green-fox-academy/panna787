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

    public Post findPostById(Long id){
        Post post = null;
        if (postRepository.findById(id).isPresent()) {
             post = postRepository.findById(id).get();
        }
        return post;
    }

    public Iterable<Post> getTop10Posts(){
        return postRepository.findTop10Posts();
    }

    public void upvotePost(Long id) {
        Post post = findPostById(id);
        post.increaseVotes();
        addPost(post);

    }

    public void downvotePost(Long id){
        Post post = findPostById(id);
        post.decreaseVotes();
        addPost(post);

    }

    public List<Post> getAllPost(){
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts;
    }
}
