package com.epam.shop.command.impl.client;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.OrderService;
import com.epam.shop.session.Session;

public class GoToBasketCommand implements Command {
    @Override
    public Page execute() {
        OrderService service = new OrderService();
        int id = Session.getCurrUserId();
        String result = service.getOrders(id);
        int productId = Reader.nextInt();
        int quantity = Reader.nextInt();
        int userId = Session.getCurrUserId();
        service.insertOrder(productId,userId,quantity);
        return new BackPage();
    }
}
