package com.epam.shop.command.impl;

import com.epam.shop.command.Command;
import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.BackPage;

/**
 * Implement command go to home page
 */
public class GoToHomePageCommand implements Command {
    /**
     * Implementation for go to home page command
     * @return return page
     */
    @Override
    public Page execute() {
        return new BackPage();
    }
}
