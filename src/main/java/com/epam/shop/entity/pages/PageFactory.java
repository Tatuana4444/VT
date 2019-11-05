package com.epam.shop.entity.pages;


import com.epam.shop.entity.pages.impl.HomePage;
import org.apache.log4j.Logger;

/**
 * Factory for pages
 */
public class PageFactory {
    private static final Logger logger = Logger.getLogger(PageFactory.class);

    /**
     * Defined page
     * @param pageName name of page
     * @return page that user needs
     */
    public Page getPage(String pageName) {
        Page page = new HomePage();
        try {
            String pageTypeValue = pageName.toUpperCase();
            PageTypes currentType = PageTypes.pageTypes(pageTypeValue);
            page = currentType.getPage();
        } catch (IllegalArgumentException e) {
            logger.error(String.format("Command - %s, cause exception.", page) + e);
        }
        return page;
    }
}
