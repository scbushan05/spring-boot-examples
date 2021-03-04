package in.bushansirgur.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Product;
import in.bushansirgur.springboot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService pService;
	
	@GetMapping("/products")
	public List<Product> getList () {
		return pService.getList();
	}
	
	@GetMapping("/products/{id}")
	public Product get (@PathVariable Integer id) {
		return pService.getProduct(id);
	}  
}
