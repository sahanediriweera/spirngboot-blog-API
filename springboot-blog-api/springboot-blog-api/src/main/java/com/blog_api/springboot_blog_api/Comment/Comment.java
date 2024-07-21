package com.blog_api.springboot_blog_api.Comment;

import com.blog_api.springboot_blog_api.Post.Post;
import com.blog_api.springboot_blog_api.User.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String content;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

}
