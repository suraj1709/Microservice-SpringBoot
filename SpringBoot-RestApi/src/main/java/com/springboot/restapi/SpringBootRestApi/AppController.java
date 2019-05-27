package com.springboot.restapi.SpringBootRestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	private ProductService service;
	@RequestMapping("/")
	public String viewHomePage(Model model)
	{
		List<Product> listproducts=service.listall();
		model.addAttribute("listProduct", listproducts);
		return "index";
	}
	

}
