package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;

/**
 * Implement command change name for admin
 */
public class ChangeNameCommand implements Command {
    @Override
    public Page execute() {
        return new BackPage();
    }
}