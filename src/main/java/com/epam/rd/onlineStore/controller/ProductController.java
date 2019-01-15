package com.epam.rd.onlineStore.controller;


import com.epam.rd.onlineStore.model.Category;
import com.epam.rd.onlineStore.model.Product;
import com.epam.rd.onlineStore.service.CategoryService;
import com.epam.rd.onlineStore.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
public class ProductController {

    private static final String VIEWS_PRODUCT_CREATE_OR_UPDATE_FORM = "createOrUpdateProductForm";
    private ProductService productService = new ProductService();
    private CategoryService categoryService = new CategoryService();

    //@GetMapping("/")
    @RequestMapping("/")
    //@RequestMapping("/index.html")
    public String index(Map<String, Object> model)
    //public ModelAndView index()
    {

        List<Product> products = productService.findAll();
        List<Category> categories = categoryService.findAll();

//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("products", products);
//        modelAndView.addObject("categories", categories);

        model.put("products", products);
        model.put("categories", categories);

        //model.put("time", new Date());
        //model.addAttribute("employees", manager.getAllEmployees());
        //return "employeesListDisplay";
        return "index";
        //return modelAndView;
        //ModelAndView modelAndView = new ModelAndView();
        //return modelAndView;
    }

    @GetMapping("/products/new")
    public String initCreationForm(Map<String, Object> model) {
        Product product = new Product();
        model.put("product", product);
        return "index";
        //return VIEWS_PRODUCT_CREATE_OR_UPDATE_FORM;
    }


    @PostMapping("/products/new")
    public String processCreationForm(Product product, BindingResult result) {
        if (result.hasErrors()) {
            //return VIEWS_PRODUCT_CREATE_OR_UPDATE_FORM;
            return "redirect:/";
        } else {
            this.productService.save(product);
            return "redirect:/";
        }
    }


    @RequestMapping("/products/new")
    public String processCreationForm2(Product product, BindingResult result) {
        if (result.hasErrors()) {
            //return VIEWS_PRODUCT_CREATE_OR_UPDATE_FORM;
            return "redirect:/";
        } else {
            this.productService.save(product);
            return "redirect:/";
        }
    }


    @RequestMapping("/header.html")
    public String header()
    {
        return "header";
    }

    @RequestMapping("/footer.html")
    public String footer()
    {
        return "footer";
    }

}
