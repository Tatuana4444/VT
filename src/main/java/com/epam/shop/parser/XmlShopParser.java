package com.epam.shop.parser;

import com.epam.shop.entity.OnlineShop;
import com.epam.shop.exception.XmlDataException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlShopParser {

    /**
     * Parse data from xml file
     * @param fileName Xml file name
     * @return OnlineShop where all users and products are saved
     * @throws XmlDataException exception during parsing
     */
    public OnlineShop parse(String fileName) throws XmlDataException {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            Path path = Paths.get(fileName);
            String xmlText = new String(Files.readAllBytes(path));
            return xmlMapper.readValue(xmlText, OnlineShop.class);
        } catch (IOException e) {
            throw new XmlDataException("can't parse file Xml name = [" + fileName + "]", e);
        }
    }
}