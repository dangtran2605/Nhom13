package com.Nhom13.Lab8.servive;

import com.Nhom13.Lab8.entity.Category;
import com.Nhom13.Lab8.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryService    {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> GetAll() {
        return categoryRepository.findAll();
    }
    public Category getCategoryByID (Integer id){
        Optional<Category> optional=categoryRepository.findById(id);
        return optional.orElse(null);
    }
    public void add(Category category){
        categoryRepository.save(category);
    }
    public void update(Category category){
        categoryRepository.save(category);
    }
    public void delete(Integer id){
        categoryRepository.deleteById(id);
    }
}
