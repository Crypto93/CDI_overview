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
			Bean<?> fileServiceBean = beanManager.resolve(beanManager.getBeans(FileService.class));

			BookService bookService = (BookService) beanManager.getReference(bookServiceBean, BookService.class,
					beanManager.createCreationalContext(bookServiceBean));
			FileService fileService = (FileService) beanManager.getReference(fileServiceBean, FileService.class,
					beanManager.createCreationalContext(fileServiceBean));

			bookService.createBook("lord of the rings");
			fileService.write("The Elder scrools must be writen and kept in files.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cdiContainer.shutdown();
		}

	}
}
