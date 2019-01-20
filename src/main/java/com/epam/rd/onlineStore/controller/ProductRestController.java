package com.epam.rd.onlineStore.controller;

import com.epam.rd.onlineStore.model.Category;
import com.epam.rd.onlineStore.model.Product;
import com.epam.rd.onlineStore.service.IProductService;
import com.epam.rd.onlineStore.service.impl.CategoryService;
import com.epam.rd.onlineStore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductRestController {

    @Autowired
    private IProductService productService = new ProductService();

    @Autowired
    private CategoryService categoryService = new CategoryService();

    @PostMapping("/products/new")
    public boolean processCreationForm(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping(value = "/products/{productId}/edit")
    public Product editProduct(@PathVariable("productId") long productId) {
        return this.productService.findById(productId);
    }

    @PutMapping("/products/{productId}/edit")
    public Product processUpdateOwnerForm(@RequestBody Product product) {
        return this.productService.save(product);
    }

    @DeleteMapping ("/products/{productId}/delete")
    public boolean deleteProduct(@PathVariable("productId") long productId) {
        return this.productService.deleteById(productId);
    }

}
