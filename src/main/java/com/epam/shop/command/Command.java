package com.epam.shop.command;

import com.epam.shop.entity.pages.Page;
/**
 * Implement command
 */
public interface Command {
    /**
     * Implementation command
     * @return page with which user will work
     */
    Page execute();
}
