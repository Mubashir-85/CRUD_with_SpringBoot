package com.CRUD.demo.Service;

import com.CRUD.demo.Model.Product;
import com.CRUD.demo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101, "Samsung", 40000),
//            new Product(102, "Oppo", 10000),
//            new Product(103, "Apple", 30000)
//    ));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
//        products.removeIf(product -> product.getProdId() == prodId);
    }

}
