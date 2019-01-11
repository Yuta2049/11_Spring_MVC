//package servlets;
//
//import Category;
//import Product;
//import CategoryService;
//import ProductService;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//public class ProductServlet extends HttpServlet {
//
//    private ProductService productService = new ProductService();
//    private CategoryService categoryService = new CategoryService();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        List<Product> products = productService.findAll();
//        req.setAttribute("products", products);
//
//        List<Category> categories = categoryService.findAll();
//        req.setAttribute("categories", categories);
//
//        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
//    }
//}
