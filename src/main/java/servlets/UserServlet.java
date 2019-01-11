//package servlets;
//
//import User;
//import UserService;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class UserServlet extends HttpServlet {
//
//    private UserService userService = new UserService();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String login = req.getParameter("login");
//        String password = req.getParameter("password");
//
//        User user = userService.findByLoginAndPassword(login, password);
//
//        if (user == null) {
//            req.setAttribute("errorMessage", "Login or password is incorrect");
//            req.getRequestDispatcher("/login.jsp").forward(req, resp);
//        } else {
//            req.getSession().setAttribute("userName", user.getUserName());
//            resp.sendRedirect("/");
//        }
//
//    }
//
//}
