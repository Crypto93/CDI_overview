package cdi.demos;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		CdiContainer cdiContainer = null;
		
		try {

			cdiContainer = CdiContainerLoader.getCdiContainer();

			cdiContainer.boot();

			BeanManager beanManager = cdiContainer.getBeanManager();

			Bean<?> bean = beanManager.resolve(beanManager.getBeans(JDBCPingService.class));

			JDBCPingService jdbcPingService = (JDBCPingService) beanManager.getReference(bean, JDBCPingService.class,
					beanManager.createCreationalContext(bean));

			jdbcPingService.ping();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cdiContainer.shutdown();
		}

	}
}
