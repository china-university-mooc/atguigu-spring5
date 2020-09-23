package com.itutry.spring5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog {

    public static final Logger log = LoggerFactory.getLogger(MyLog.class);

    public static void main(String[] args) {
        log.info("My ingo log");
        log.warn("My warn log");
    }
}
