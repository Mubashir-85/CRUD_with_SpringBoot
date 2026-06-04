package com.CRUD.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product(){

    }
    public Product(int prodId, String prodName, int prodPrice){
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdId(){
        return prodId;
    }

    public void setProdId(int id){
        this.prodId = id;
    }

    public String getProdName(){
        return prodName;
    }

    public void  setProdName(String name){
        this.prodName = name;
    }

    public int getProdPrice(){
        return prodPrice;
    }

    public void setProdPrice(int price){
        this.prodPrice = price;
    }

}
