package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getPostList() {
        return postRepository.findAll();
    }
    @GetMapping("/posts/{index}")
    public Post getPost(@PathVariable int index) {
        return postRepository.findById(index).get();
    }

    @PostMapping("/posts")
    public void savePost(@RequestBody Post post) {
        postRepository.save(post);
        System.out.println(post);
    }

    @PutMapping("/posts")
    public void updatePost(@RequestBody Post post) {
        postRepository.save(post);
    }

}
