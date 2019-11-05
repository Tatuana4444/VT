package com.epam.shop.dao;

import com.epam.shop.entity.Order;
import com.epam.shop.entity.User;
import com.epam.shop.singelton.SingletonOnlineShop;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This class realize UserDAO
 */
public class OrderDao {
    private List<Order> orders = SingletonOnlineShop.getInstance().getOrder();

    /**
     * Setter for user
     *
     * @param order user which need to add
     */
    public void addNewOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> selectOrders(int id) {
        return orders.stream()
                .filter(o->o.getUserId()==id)
                .collect(Collectors.toList());
    }
}
