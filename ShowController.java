package springmvc.controller;


import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import springmvc.model.Product;
 @Controller
public class ShowController {

	  @PostMapping("/show")
	 public String show(Model m,HttpServletRequest req)
	 {
		  int productId=Integer.parseInt(req.getParameter("pid"));
		  String productName=req.getParameter("pname");
		  float price=Float.parseFloat(req.getParameter("price"));
		  Product product=new Product(productId,productName,price);
		  m.addAttribute("product",product);
		  return "show.jsp";
	 }
	  
	  @PostMapping("/hello")
	  public void hello(HttpServletRequest req,HttpServletResponse res) throws IOException

 {
	 res.getWriter().println("Hello world");
 }
}