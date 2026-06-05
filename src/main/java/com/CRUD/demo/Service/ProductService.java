package com.CRUD.demo.Service;

import com.CRUD.demo.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101, "Samsung", 40000),
            new Product(102, "Oppo", 10000),
            new Product(103, "Apple", 30000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(100, "No Item", 0));
    }
    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index = 0;
        for(int i =0; i< products.size(); i++){
            if(products.get(i).getProdId() == prod.getProdId())
                index = i;
            products.set(index,prod);
        }
    }

}
