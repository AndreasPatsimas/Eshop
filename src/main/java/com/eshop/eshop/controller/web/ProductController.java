package com.eshop.eshop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/viewProducts")
	public String products() {
		return "products.html";
	}
}
