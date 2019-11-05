package com.epam.shop.exception;
/**
 * This class describes XmlDataException
 */
public class XmlDataException extends Exception {
    /**
     * XmlDataException handle
     * @param message exception description
     * @param e information about exception
     */
    public XmlDataException(String message, Exception e) {super(message, e);}
}
