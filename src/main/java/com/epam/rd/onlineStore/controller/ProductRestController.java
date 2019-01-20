package com.epam.rd.onlineStore.controller;

import com.epam.rd.onlineStore.model.Category;
import com.epam.rd.onlineStore.model.Product;
import com.epam.rd.onlineStore.service.IProductService;
import com.epam.rd.onlineStore.service.impl.CategoryService;
import com.epam.rd.onlineStore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductRestController {

    @Autowired
    private IProductService productService = new ProductService();

    @Autowired
    private CategoryService categoryService = new CategoryService();

//    @GetMapping("/")
//    public List<Product> all() {
//        return productService.findAll();
//    }


    @RequestMapping(value = "/products/new", method = RequestMethod.GET)
    public //@ResponseBody
//    String addNewProduct(Model model) {
    Product addNewProduct() {
//        model.addAttribute("product", new Product());
//        model.addAttribute("isNewProduct", true);
//        return "fragments/createOrUpdateProductForm:: productEdit";
        return new Product();
    }

    @PostMapping("/products/new")
    public String processCreationForm(@ModelAttribute Product product, BindingResult result) {
//        if (result.hasErrors()) {
//            return "redirect:/";
//        } else {
            this.productService.add(product);
            return "redirect:/";
//        }
    }


    @RequestMapping(value = "/products/{productId}/edit", method = RequestMethod.GET)
    public Product editProduct(@PathVariable("productId") long productId) {
        return this.productService.findById(productId);
    }

    @PutMapping("/products/{productId}/edit")
    public Product processUpdateOwnerForm(@RequestBody Product product) {
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getCategory());
        return this.productService.save(product);
    }

}
