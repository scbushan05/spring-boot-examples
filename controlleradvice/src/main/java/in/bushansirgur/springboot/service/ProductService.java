package in.bushansirgur.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.bushansirgur.springboot.entity.Product;
import in.bushansirgur.springboot.exceptions.NoDataFoundException;
import in.bushansirgur.springboot.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	private static List<Product> list = new ArrayList<>();
	
	static {
//		list.add(new Product(1, "iPhone XR", 500.00));
//		list.add(new Product(2, "Galaxy Note 10", 700.00));
//		list.add(new Product(3, "Oneplus Nord", 400.00));
//		list.add(new Product(4, "Galaxy S10", 750.00));
//		list.add(new Product(5, "iPhone 11", 700.00));
	}
	
	public List<Product> getList () {
		if (list.isEmpty()) {
			throw new NoDataFoundException("Products data is not avaialbe");
		}
		return list;
	}
	
	public Product getProduct(Integer id) {
		Optional<Product> theProduct = list.stream().filter(p -> p.getId() == id).findFirst();
		if (!theProduct.isPresent()) {
			throw new ResourceNotFoundException("Product is not found for the id->"+id);
		}
		return theProduct.get();
	}
}
