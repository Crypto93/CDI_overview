package cdi.demos;

import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class BookService {

    @Inject
    private Logger logger;


    public void createBook(String title) {
        logger.info("Create book : {}", title);
    }
}
