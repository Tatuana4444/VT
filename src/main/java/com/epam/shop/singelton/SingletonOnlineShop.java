package com.epam.shop.singelton;

import com.epam.shop.entity.OnlineShop;

/**
 * Class that implement singleton for online shop
 */
public class SingletonOnlineShop {

    private SingletonOnlineShop() {
    }

    private static OnlineShop shop;

    /**
     * Getter for online shop
     * @return online shop
     */
    public static OnlineShop getInstance() {
        if (shop == null) {
            shop = new OnlineShop();
        }
        return shop;
    }

    /**
     * Initialize shop by value
     * @param oShop value that needed to initialize OnlineShop
     */
    public static void init(OnlineShop oShop) {
        if (shop != null) {
            return;
        }
        shop = oShop;
    }
}

