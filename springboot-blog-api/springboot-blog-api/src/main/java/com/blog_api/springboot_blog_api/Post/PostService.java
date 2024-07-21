package com.blog_api.springboot_blog_api.Post;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService{
    @Override
    public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {
        return null;
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer postId) {
        return null;
    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<PostDto> getAllPosts() {
        return null;
    }

    @Override
    public PostDto getPostById(Integer id) {
        return null;
    }

    @Override
    public PostReponse getPostsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public List<PostDto> getPostsByUser(Integer userId) {
        return null;
    }

    @Override
    public List<PostDto> searchPost(String keyword) {
        return null;
    }

    @Override
    public PostReponse getAllPostsByPage(Integer pageNumber, Integer pageSize, String sortBy, String sortDir) {
        return null;
    }
}
