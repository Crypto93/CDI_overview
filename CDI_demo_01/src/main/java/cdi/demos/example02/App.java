package cdi.demos.example02;

import java.util.Set;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;

public class App {

	public static void main(String[] args) {
		CdiContainer cdiContainer = null;
		try {
			cdiContainer = CdiContainerLoader.getCdiContainer();
	        cdiContainer.boot();

	        BeanManager beanManager = cdiContainer.getBeanManager();

	        Set<Bean<?>> beans = beanManager.getBeans(PersonalBankAccount.class);
	        Bean<?> bean = beanManager.resolve(beans);

	        PersonalBankAccount bankAccount = (PersonalBankAccount) beanManager.getReference(bean, PersonalBankAccount.class, beanManager.createCreationalContext(bean));

	        System.out.println(bankAccount.deposit());
	        System.out.println(bankAccount.withdraw());

		} finally {
			cdiContainer.shutdown();
		}
	}

}
