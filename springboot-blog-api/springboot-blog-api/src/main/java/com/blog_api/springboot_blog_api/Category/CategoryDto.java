package com.blog_api.springboot_blog_api.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;


    @NotBlank
    @Size(min = 3,message = "Length of title should be minimum 3")
    private String categoryTitle;

    @NotBlank
    @Size(min = 10,message = "Length of description should be more than 10")
    private String categoryDescription;

}
