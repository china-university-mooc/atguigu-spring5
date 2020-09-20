package com.itutry.spring5;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Factory {

    public static UserDao getUserDao() {
        try {
            Class<?> clazz = getBeanClass();
            return (UserDao) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Class<?> getBeanClass() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(ClassLoader.getSystemClassLoader().getResourceAsStream("bean0.xml"));
        Element root = document.getRootElement();
        Element bean = root.element("bean");
        String aClass = bean.attributeValue("class");
        return Class.forName(aClass);
    }
}
