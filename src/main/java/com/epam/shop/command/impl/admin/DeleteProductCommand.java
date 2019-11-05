package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;

/**
 * Implement command delete product for admin
 */
public class DeleteProductCommand implements Command {
    /**
     * Implementation for delete product command
     * @return back page
     */
    @Override
    public Page execute() {
        return new BackPage();
    }
}