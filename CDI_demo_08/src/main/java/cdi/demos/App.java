package cdi.demos;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import java.util.Set;

public class App {

	public static void main(String[] args) throws InterruptedException {

		CdiContainer cdiContainer = null;
		try {

			cdiContainer = CdiContainerLoader.getCdiContainer();

			cdiContainer.boot();

			BeanManager beanManager = cdiContainer.getBeanManager();

			Set<Bean<?>> beans = beanManager.getBeans(BookService.class);
			Bean<?> bean = beanManager.resolve(beans);

			BookService bookService = (BookService) beanManager.getReference(bean, BookService.class,
					beanManager.createCreationalContext(bean));

			Book book = bookService.createBook("H2G2", 15F);
			System.out.println("# " + book);
			System.out.println("# " + bookService.raisePrice(book));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cdiContainer.shutdown();
		}

	}
}
