package com.blog_api.springboot_blog_api.Post;

import com.blog_api.springboot_blog_api.Category.Category;
import com.blog_api.springboot_blog_api.Comment.Comment;
import com.blog_api.springboot_blog_api.User.User;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(length = 10000,nullable = false)
    private String content;

    private String imageName;

    private Date addedDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();

}
