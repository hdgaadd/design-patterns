package org.codeman.adapter;

import lombok.extern.slf4j.Slf4j;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * @author hdgaadd
 * Created on 2022/05/04
 */
@Slf4j
public class FishingBoat {
    /**
     * [seɪl]航行
     */
    public void sail() {
        LOGGER.info("the fishing boat is starting");
    }
}
