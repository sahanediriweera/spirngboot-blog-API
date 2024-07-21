package com.blog_api.springboot_blog_api.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, Integer id) {
        return null;
    }

    @Override
    public void deleteCategory(Integer id) {

    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return null;
    }

    @Override
    public CategoryDto getCategoryById(Integer catId) {
        return null;
    }
}
