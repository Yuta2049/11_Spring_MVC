package com.epam.rd.onlineStore.service.impl;

import com.epam.rd.onlineStore.dto.ProductDAO;
import com.epam.rd.onlineStore.model.Product;
import com.epam.rd.onlineStore.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductDAO productDAO = new ProductDAO();

    public ProductService() {}

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product save(Product product) {
        return productDAO.save(product);
    }

    @Override
    public Product findById(long id) {
        return productDAO.findById(id);
    }

    @Override
    public boolean deleteById(long id) {
        return productDAO.deleteById(id);
    }

    @Override
    public boolean add(Product product) {
        return productDAO.add(product);
    }
}
