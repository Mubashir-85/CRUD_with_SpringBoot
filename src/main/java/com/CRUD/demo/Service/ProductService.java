package com.CRUD.demo.Service;

import com.CRUD.demo.Model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"Samsung", 40000),
            new Product(102,"Oppo", 10000),
            new Product(103,"Apple", 30000)
    );
    public List<Product> getProducts(){
        return products;
    }
}
