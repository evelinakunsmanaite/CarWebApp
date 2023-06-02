/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import entity.Car;
import entity.CarList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "YearOfIssueAndPriceServlet", urlPatterns = {"/yearOfIssueAndPriceServlet"})
public class YearOfIssueAndPriceServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
         try {
                        int yearOfIssue = Integer.parseInt(request.getParameter("yearOfIssue"));
           double price = Double.parseDouble(request.getParameter("price"));
           List<Car> car =CarList.getListYearOfIssueAndPrice(yearOfIssue, price);
            request.setAttribute("result", car);
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/result.jsp");
            rd.forward(request, response);
                 car.clear();
        } catch (Exception e) {
            request.setAttribute("error", "Ошибка ввода данных");
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/error.jsp");
            rd.forward(request, response);            
        }
}
}
