package com.blog_api.springboot_blog_api.Post;

import com.blog_api.springboot_blog_api.Category.CategoryDto;
import com.blog_api.springboot_blog_api.Comment.CommentDto;
import com.blog_api.springboot_blog_api.User.UserDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private Integer postId;

    private String title;

    private String content;

    private String imageName;

    private Date addedDate;

    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();
}
