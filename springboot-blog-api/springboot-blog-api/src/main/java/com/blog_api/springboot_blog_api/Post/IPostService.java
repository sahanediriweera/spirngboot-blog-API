package com.blog_api.springboot_blog_api.Post;

import org.w3c.dom.ls.LSException;

import java.util.List;

public interface IPostService {
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    PostDto updatePost(PostDto postDto,Integer postId);

    void deletePost(Integer postId);

    List<PostDto> getAllPosts();

    PostDto getPostById(Integer id);

    PostReponse getPostsByCategory(Integer categoryId,Integer pageNumber,Integer pageSize);

    List<PostDto> getPostsByUser(Integer userId);

    List<PostDto> searchPost(String keyword);

    PostReponse getAllPostsByPage(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
}
