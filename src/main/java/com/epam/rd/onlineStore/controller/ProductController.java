package com.epam.rd.onlineStore.controller;


import com.epam.rd.onlineStore.model.Category;
import com.epam.rd.onlineStore.model.Product;
import com.epam.rd.onlineStore.service.CategoryService;
import com.epam.rd.onlineStore.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
public class ProductController {

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
