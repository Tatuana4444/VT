package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;

/**
 * Implement command add product for admin
 */
public class AddProductCommand implements Command {
    @Override
    public Page execute() {
        return new BackPage();
    }
}