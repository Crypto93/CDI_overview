package cdi.demos;

import javax.inject.Inject;

public class BookService {
	
	@Inject @StandardBook
	double standardPrice;

	@Inject @LuxuriousBook
	double luxPrice;

    public String createBook(String title, String author, boolean isLuxurious){
    	Book book;
    	if (!isLuxurious) {
    		book = new Book(title, author, standardPrice);
		} else {
			book = new Book(title, author, luxPrice);
		}
    	
		return book.toString();
	}
	
}
