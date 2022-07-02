package com.example.demo.Repository;

import com.example.demo.Model.Cart;
import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart,String>{

}
