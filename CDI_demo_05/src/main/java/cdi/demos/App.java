package cdi.demos;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

public class App {

	public static void main(String[] args) throws Exception {

		CdiContainer cdiContainer = null;
		try {
			cdiContainer = CdiContainerLoader.getCdiContainer();
			cdiContainer.boot();

			BeanManager beanManager = cdiContainer.getBeanManager();

			Bean<?> bookServiceBean = beanManager.resolve(beanManager.getBeans(BookService.class));

			BookService bookService = (BookService) beanManager.getReference(bookServiceBean, BookService.class,
					beanManager.createCreationalContext(bookServiceBean));

			System.out.println(bookService.createBook("Lord of the rings", "J.R.R.Tolkien", true));
			System.out.println(bookService.createBook("Lord of the rings", "J.R.R.Tolkien", false));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cdiContainer.shutdown();

		}

	}
}
