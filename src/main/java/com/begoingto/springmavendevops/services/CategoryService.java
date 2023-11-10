package com.begoingto.springmavendevops.services;

import com.begoingto.springmavendevops.models.Category;
import com.begoingto.springmavendevops.models.CategoryArticles;
import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    CategoryArticles getCategoryById(Integer id);
    Category save(Category category);
    boolean delete(Integer id);
    Category update(CategoryArticles categoryArticles);
}
