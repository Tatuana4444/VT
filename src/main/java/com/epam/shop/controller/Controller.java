package com.epam.shop.controller;

import com.epam.shop.entity.pages.Page;
import com.epam.shop.entity.pages.impl.HomePage;


/**
 * There is class that start program
 */
public class Controller {
    /**
     * @author Tanyana Bondareva
     * Here start point of program
     * @param args command line values
     */
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();
        Page page = new HomePage();
        page.show();
        databaseLoader.destroy();
    }

}
