package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;

/**
 * Implement command change price for admin
 */
public class ChangePriceCommand implements Command {
    @Override
    public Page execute() {
        return new BackPage();
    }
}