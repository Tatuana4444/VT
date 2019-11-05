package com.epam.shop.entity;

import java.util.Objects;

public class Order extends Entity{
    private Product product;
    private int quantity;
    private int userId;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return quantity == order.quantity &&
                userId == order.userId &&
                Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), product, quantity, userId);
    }
}
