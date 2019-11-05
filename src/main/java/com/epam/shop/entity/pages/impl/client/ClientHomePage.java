package com.epam.shop.entity.pages.impl.client;

import com.epam.shop.command.Command;
import com.epam.shop.command.CommandFactory;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.reader.Reader;

public class ClientHomePage implements Page {
    @Override
    public void show() {
        int result;
        CommandFactory commandFactory = new CommandFactory();
        while(true) {
            System.out.println("1-list of product");
            System.out.println("2-select products");
            System.out.println("3-go to basket");
            System.out.println("4-go to profile");
            System.out.println("0-exit");
            result = Reader.nextInt();
            if (result <= 0 || result >3){
                break;
            }
            Command command = commandFactory.getCommand(result+20);
            Page page = command.execute();
            page.show();
        }
    }
}
