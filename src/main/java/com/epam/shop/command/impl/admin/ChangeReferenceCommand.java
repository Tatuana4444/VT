package com.epam.shop.command.impl.admin;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;

/**
 * Implement command change reference for admin
 */
public class ChangeReferenceCommand implements Command {
    /**
     * Implementation for change reference command
     * @return back page
     */
    @Override
    public Page execute() {

        return new BackPage();
    }
}