package com.epam.rd.onlineStore.controller;


import com.epam.rd.onlineStore.model.Category;
import com.epam.rd.onlineStore.model.Product;
import com.epam.rd.onlineStore.service.IProductService;
import com.epam.rd.onlineStore.service.impl.CategoryService;
import com.epam.rd.onlineStore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

//@RestController
@Controller
public class ProductController {

    private static final String VIEWS_PRODUCT_CREATE_OR_UPDATE_FORM = "createOrUpdateProductForm";

    @Autowired
    private IProductService productService = new ProductService();

    @Autowired
    private CategoryService categoryService = new CategoryService();

    @GetMapping("/")
    //@RequestMapping("/")
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



//    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    @RequestMapping(value = "/products/{productId}/edit", method = RequestMethod.GET)
    public @ResponseBody
    String getTime(@PathVariable("productId") long productId) {

//        Random rand = new Random();
//        float r = rand.nextFloat() * 100;
//        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
//        System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + new Date().toString());

        Product product = this.productService.findById(productId);
        String result = product.getId()+", "+product.getName();
        System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + productId);
        System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + result);

        return result;
    }


//    public String handlePostRequest(long productId, Model model) {
//        Product product = this.productService.findById(productId);
//        model.addAttribute(product);
//        return "redirect:/";
//        //return "index";
//    }



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

//    @GetMapping("/products/{productId}/edit")
//    public String initUpdateOwnerForm(@PathVariable("productId") long productId, Model model) {
//        Product product = this.productService.findById(productId);
//        model.addAttribute(product);
//        //model.put("product", product);
//        //return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;rn
//        //return "redirect:/index";
//        return "redirect:/";
//    }

    //@PostMapping("/products/{productId}/edit")
    public String processUpdateOwnerForm(@Valid Product product, BindingResult result, @PathVariable("productId") long productId) {
        if (result.hasErrors()) {
            //return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
            return "redirect:/";
        } else {
            product.setId(productId);
            this.productService.save(product);
            //return "redirect:/products/{productId}";
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
