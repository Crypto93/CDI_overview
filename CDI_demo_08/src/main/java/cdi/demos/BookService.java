package cdi.demos;

import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

//@Loggable
public class BookService {

    @Inject
    private IsbnGenerator generator;

    @Inject
    private Logger logger;

    @Loggable
    public Book createBook(String title, Float price) {
        logger.info("Book created");
        return new Book(title, price, generator.generateNumber());
    }

    public Book raisePrice(Book book) throws InterruptedException {
        logger.info("Price raised");
        book.setPrice(book.getPrice() * 2.5F);
        return book;
    }
}
