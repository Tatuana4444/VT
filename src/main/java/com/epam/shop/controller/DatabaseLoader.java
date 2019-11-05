package com.epam.shop.controller;

import com.epam.shop.entity.OnlineShop;
import com.epam.shop.exception.XmlDataException;
import com.epam.shop.parser.XmlShopParser;
import com.epam.shop.singelton.SingletonOnlineShop;
import com.epam.shop.writer.XmlShopWriter;
import org.apache.log4j.Logger;

/**
 * Class that work with database
 */
public class DatabaseLoader {

    private static final Logger logger = Logger.getLogger(DatabaseLoader.class);
    private static final String PATH = "src/main/resources/shop.xml";

    /**
     * Load data from darabase
     */
    public void load() {
        try {
                XmlShopParser parser = new XmlShopParser();
                OnlineShop shop = parser.parse(PATH);
                SingletonOnlineShop.init(shop);
        } catch (XmlDataException e) {
            logger.warn("Data not loaded .", e);
        }
    }

    /**
     * Save data to database
     */
    public void destroy() {
        try {
                XmlShopWriter xmlWriter = new XmlShopWriter();
                OnlineShop shop = SingletonOnlineShop.getInstance();
                xmlWriter.write(shop, PATH);
        } catch (XmlDataException e) {
            logger.warn("Data not saved .", e);
        }
    }
}
