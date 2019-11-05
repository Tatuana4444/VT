package com.epam.shop.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;


public class OnlineShop {

    @JacksonXmlElementWrapper(localName = "products")
    private List<Product> product;
    @JacksonXmlElementWrapper(localName = "users")
    private List<User> user;
    @JacksonXmlElementWrapper(localName = "basket")
    private List<Order> order;

    public OnlineShop() {
        product = new ArrayList<>();
        user = new ArrayList<>();
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> value) {
        this.product = value;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> value) {
        this.user = value;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

}
