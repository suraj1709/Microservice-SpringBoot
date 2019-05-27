package com.springboot.restapi.SpringBootRestApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>
{

}
