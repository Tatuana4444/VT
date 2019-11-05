package com.epam.shop.command.impl;

import com.epam.shop.command.Command;
import com.epam.shop.entity.User;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
import com.epam.shop.entity.pages.impl.HomePage;
import com.epam.shop.reader.Reader;
import com.epam.shop.service.UserService;

public class RegisterCommand implements Command {
    @Override
    public Page execute() {
        UserService service = new UserService();
        User user = new User();
        System.out.println("enter your name ");
        String name = Reader.nextString();
        user.setName(name);
        System.out.println("enter user name ");
        String login = Reader.nextString();
        user.setLogin(login);
        System.out.println("enter password ");
        String password = Reader.nextString();
        user.setPassword(password);
        System.out.println("enter role ");
        System.out.println("1-admin , 2- client ");
        int role = Reader.nextInt();
        if (role ==1){
            user.setRole("admin");
        }else if (role ==2){
            user.setRole("client");
        }else {
            System.out.println("incorrect value");
            return new BackPage();
        }

        service.register(user);

        return new BackPage();
    }
}
