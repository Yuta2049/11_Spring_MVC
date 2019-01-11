package com.epam.rd.onlineStore.service;

import com.epam.rd.onlineStore.dto.CategoryDAO;
import com.epam.rd.onlineStore.model.Category;

import java.util.List;

public class CategoryService {

    private CategoryDAO productDAO = new CategoryDAO();

    public CategoryService() {}

    public List<Category> findAll() {
        return productDAO.findAll();
    }

}
