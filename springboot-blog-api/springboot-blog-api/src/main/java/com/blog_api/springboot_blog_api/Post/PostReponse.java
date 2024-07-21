package com.blog_api.springboot_blog_api.Post;

import java.util.List;

public class PostReponse {

    private List<PostDto> content;

    private Integer pageNumber;

    private Integer pageSize;

    private Long totalElements;

    private Integer totalPages;

    private Boolean lastPage;
}
