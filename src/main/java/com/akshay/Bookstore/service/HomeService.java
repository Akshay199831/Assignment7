package com.akshay.Bookstore.service;


import com.akshay.Bookstore.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Product> getProduct(){
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("1","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCRpUaGSRyEHdSEXD85DfwM391R9LbsERHZQ&usqp=CAU", "Winnable Fassion Document Cover", "Product 1");

        Product product2 = new Product("2","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCRpUaGSRyEHdSEXD85DfwM391R9LbsERHZQ&usqp=CAU", "Winnable Fassion1 Document Cover", "Product 2");

        products.add(product1);
        products.add(product2);

        return products;
    }

    public List<Product> searchedProduct(String productName){
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("1","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCRpUaGSRyEHdSEXD85DfwM391R9LbsERHZQ&usqp=CAU", productName, "Product 1");

        products.add(product1);


        return products;
    }
}
