package com.ecom.business.sevice;


import com.ecom.business.model.Category;
import org.springframework.stereotype.Service;
import com.ecom.business.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
