package test;

import java.util.Set;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;

public class App {
	

	public static void main(String[] args) {

		CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();
		
		cdiContainer.boot();
		
		BeanManager beanManager = cdiContainer.getBeanManager();
		
		Set<Bean<?>> beans = beanManager.getBeans(TestInjectable.class);
		Bean<?> bean = beanManager.resolve(beans);
		
		TestInjectable testInjectable = (TestInjectable) beanManager.getReference(bean, TestInjectable.class, beanManager.createCreationalContext(bean));
		
		System.out.println(testInjectable.print());
		
		cdiContainer.shutdown();
		
		
	}

}