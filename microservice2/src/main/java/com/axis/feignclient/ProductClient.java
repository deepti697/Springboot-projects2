package com.axis.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axis.model.Product;

@FeignClient(name = "microservice1")
public interface ProductClient {
	
	@GetMapping("/api/v1/products")
	public List<Product> getAllProduct();

	@PostMapping("/product")
	public Product addProduct (Product product);
	
	@GetMapping("/product/id")
	public Product getProductById(@PathVariable String id);
}
