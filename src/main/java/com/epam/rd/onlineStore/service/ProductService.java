package com.epam.rd.onlineStore.service;

import com.epam.rd.onlineStore.dto.ProductDAO;
import com.epam.rd.onlineStore.model.Product;

import java.util.List;

public class ProductService {

    private ProductDAO productDAO = new ProductDAO();

    public ProductService() {}

    public List<Product> findAll() {
        return productDAO.findAll();
    }

}
