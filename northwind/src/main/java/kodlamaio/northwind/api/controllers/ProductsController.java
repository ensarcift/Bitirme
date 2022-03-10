package kodlamaio.northwind.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concrates.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;
	
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DateResult<List <Product>> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add") //gönderi sen veriyorsun
	public Result add(@RequestBody Product product) {
		//requestbody hem data gönderiyor hemde datan budur diyor
		
		return this.productService.add(product);
	}
	
	
	
	
}
