package com.blog_api.springboot_blog_api.Comment;

import com.blog_api.springboot_blog_api.Category.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @PostMapping("/post/{postId}/user/{userId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId,@PathVariable Integer userId){
        CommentDto createComment = commentService.createComment(commentDto,postId,userId);
        return new ResponseEntity<CommentDto>(createComment, HttpStatus.OK);
    }


    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId){
        commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment delete Successfully",true),HttpStatus.OK);
    }
}
