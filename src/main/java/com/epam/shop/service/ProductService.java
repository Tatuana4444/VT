package com.epam.shop.service;

import com.epam.shop.dao.ProductDao;
import com.epam.shop.entity.Product;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class implements product functions
 */
public class ProductService {

    public String getProduct(String name) {
        ProductDao productDao = new ProductDao();
        List<Product> productList = productDao.selectProducts(name);
        StringBuilder data = new StringBuilder();
        String line = "----------------------------------------------------------------------\n";
        data.append(line);
        data.append(String.format("%5s %25s %25s %10s %n", "id", "name", "description", "price"));
        data.append(line);
        for (Product p : productList) {
            data.append(String.format("%5s %25s %25s %10s %n",
                    p.getId(), p.getName(), p.getDescription(), p.getPrice()));
        }
        data.append(line);
        return data.toString();
    }
}
