package com.epam.shop.writer;

import com.epam.shop.entity.OnlineShop;
import com.epam.shop.exception.XmlDataException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

/**
 * Class that save data to file
 */
public class XmlShopWriter {
    public void write(OnlineShop shop, String fileName) throws XmlDataException {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File(fileName), shop);
        } catch (IOException e) {
            throw new XmlDataException("can't open file Xml name = [" + fileName + "]", e);
        }
    }
}
