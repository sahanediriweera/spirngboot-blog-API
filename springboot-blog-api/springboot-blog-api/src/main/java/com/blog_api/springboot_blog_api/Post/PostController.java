package com.blog_api.springboot_blog_api.Post;


import com.blog_api.springboot_blog_api.Category.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private IPostService postService;

    @Value("${project.image}")
    private String PATH;

    @PostMapping("/user/{userId}/category/{categoryId}/posts")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto, @PathVariable Integer userId,@PathVariable Integer categoryId){
        PostDto savedPost = postService.createPost(postDto,userId,categoryId);
        return new ResponseEntity<>(savedPost, HttpStatus.OK);
    }

    @GetMapping("/category/{categoryId}/posts")
    public ResponseEntity<PostReponse> getPostsByCategory(
            @PathVariable Integer categoryId,
            @RequestParam(value = "pageNumber",defaultValue = "0",required = false) Integer pageNumber,
            @RequestParam(value = "pageSize",defaultValue = "10",required = false) Integer pageSize
    ){
        PostReponse postReponse = postService.getPostsByCategory(categoryId, pageNumber, pageSize);
        return new ResponseEntity<>(postReponse,HttpStatus.OK);
    }

    @GetMapping("/user/{userId}/posts")
    public ResponseEntity<List<PostDto>> getPostsByUser(@PathVariable Integer userId){
        List<PostDto> posts = postService.getPostsByUser(userId);
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }

    @GetMapping("/posts/{postId}")
    public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId){
        return new ResponseEntity<>(postService.getPostById(postId),HttpStatus.OK);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<PostDto>> getAllPosts(){
        return new ResponseEntity<>(postService.getAllPosts(),HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}")
    public ResponseEntity<ApiResponse> deletePost(@PathVariable Integer postId){
        postService.deletePost(postId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Post Deleted Successfully",true),HttpStatus.OK);
    }

    @PutMapping("/posts/{postId}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto,@PathVariable Integer postId){
        PostDto post = postService.updatePost(postDto,postId);
        return new ResponseEntity<PostDto>(post,HttpStatus.OK);
    }

    @GetMapping("/postPage")
    public ResponseEntity<PostReponse> getAllPostsByPage(
            @RequestParam(value = "pageNumber",defaultValue = "0",required = false) Integer pageNumber,
            @RequestParam(value = "pageSize",defaultValue = "10",required = false) Integer pageSize,
            @RequestParam(value = "sortBy",defaultValue = "ASC",required = false) String sortBy,
            @RequestParam(value = "sortDir",defaultValue = "DESC",required = false)String sortDir
    ){
        PostReponse postReponse = postService.getAllPostsByPage(pageNumber,pageSize,sortBy,sortDir);
        return new ResponseEntity<>(postReponse,HttpStatus.OK);
    }

    @GetMapping("/post/search/{keywords}")
    public ResponseEntity<List<PostDto>> searchPostByTitle(@PathVariable("keywords") String keywords){
        List<PostDto> result = postService.searchPost(keywords);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

}
