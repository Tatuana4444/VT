package com.epam.shop.command.impl.client;

import com.epam.shop.command.Command;
import com.epam.shop.entity.Order;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.OrderService;
import com.epam.shop.service.ProductService;
import com.epam.shop.service.UserService;
import com.epam.shop.session.Session;

public class SelectProductCommand implements Command {
    @Override
    public Page execute() {
        OrderService service = new OrderService();
        System.out.println("enter product id and quantity ");
        int productId = Reader.nextInt();
        int quantity = Reader.nextInt();
        int userId = Session.getCurrUserId();
        service.insertOrder(productId,userId,quantity);
        return new BackPage();
    }
}
