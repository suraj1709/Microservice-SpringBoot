package com.springboot.restapi.SpringBootRestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listall()
	{
		return repo.findAll();
		
	}
	public void save (Product product)
	{
		repo.save(product);
	}
	public Product get(Long id)
	{
		return repo.findOne(id);
	}
    public void delete(Long id)
    {
    	repo.delete(id);
    }
}
