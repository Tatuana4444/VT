package com.epam.shop.entity.pages.impl;

import com.epam.shop.command.Command;
import com.epam.shop.command.CommandFactory;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.reader.Reader;

public class HomePage implements Page {
    @Override
    public void show() {

        int result;
        CommandFactory commandFactory = new CommandFactory();
        while(true) {
            System.out.println("1-login");
            System.out.println("2-register");
            System.out.println("0-close");
            result = Reader.nextInt();
            if (result ==0){
                break;
            }
            Command command = commandFactory.getCommand(result);
            Page page = command.execute();
            page.show();
        }

    }
}
