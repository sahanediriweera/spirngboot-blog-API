package com.blog_api.springboot_blog_api.Category;

import java.util.List;

public interface ICategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto,Integer id);

    void deleteCategory(Integer id);

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(Integer catId);
}
