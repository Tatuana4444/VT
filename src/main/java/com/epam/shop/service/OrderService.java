package com.epam.shop.service;

import com.epam.shop.dao.OrderDao;
import com.epam.shop.dao.ProductDao;
import com.epam.shop.entity.Order;
import com.epam.shop.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This class implements user functions
 */
public class OrderService {

    public void insertOrder(int productId, int userId , int quantity) {
        Order order = new Order();
        ProductDao productDao = new ProductDao();
        OrderDao orderDao = new OrderDao();
        Optional<Product> product = productDao.getProduct(productId);
        if (!product.isPresent()) {
          return;
        }
        order.setProduct(product.get());
        order.setUserId(userId);
        order.setQuantity(quantity);
        orderDao.addNewOrder(order);
    }

    public void SetOrderAsNull(int productId, int userId) {
        OrderDao orderDao = new OrderDao();
         Optional<Order> order= orderDao.selectOrder(userId, productId);
         if (!order.isPresent())
             return;
         Order o = order.get();
        orderDao.SetAsNull(o);
    }

    public  int getTotalPrice(int id){
        OrderDao orderDao = new OrderDao();
        List<Order> orderList = orderDao.selectOrders(id);
        int totalPrice = 0;
        for (Order o : orderList) {
            totalPrice += o.getProduct().getPrice()*o.getQuantity();
        }
        return  totalPrice;
    }

    public String getOrders(int id) {
        OrderDao orderDao = new OrderDao();
        List<Order> orderList = orderDao.selectOrders(id);
        StringBuilder data = new StringBuilder();
        String line = "----------------------------------------------------------------------\n";
        data.append(line);
        data.append(String.format("%5s %25s %25s %10s %n", "id", "name", "price" ,"quantity"));
        data.append(line);
        for (Order o : orderList) {
            Product product = o.getProduct();
            data.append(String.format("%5s %25s %25s %10s %n",
                    product.getId(), product.getName(),product.getPrice(),o.getQuantity()));
        }
        data.append(line);
        return data.toString();
    }

    public void SetOrdersAsNull(int userId) {
        OrderDao orderDao = new OrderDao();
        List<Order> orderList = orderDao.selectOrders(userId);
        for (Order order : orderList) {
            orderDao.SetAsNull(order);
        }
    }
}
