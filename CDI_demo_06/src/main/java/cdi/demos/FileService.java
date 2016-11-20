package cdi.demos;

import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class FileService {


    @Inject
    private Logger logger;


    public void write(String text) throws Exception {
        logger.info("Write text to file : {}", text);
    }
}
