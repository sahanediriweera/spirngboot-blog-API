package com.blog_api.springboot_blog_api.Comment;

public interface ICommentService {
    CommentDto createComment(CommentDto commentDto,Integer postId,Integer userId);

    void deleteComment(Integer commentId);
}
