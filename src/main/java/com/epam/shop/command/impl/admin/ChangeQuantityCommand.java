package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;
/**
 * Implement command change quality for admin
 */
public class ChangeQuantityCommand implements Command {
    /**
     * Implementation for change quality command
     * @return back page
     */
    @Override
    public Page execute() {
        return new BackPage();
    }
}