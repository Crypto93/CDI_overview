package cdi.demos;

import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Loggable
@Interceptor
public class LoggingInterceptor {

	@Inject
	private Logger logger;

	@AroundInvoke
	private Object intercept(InvocationContext ic) throws Exception {
		logger.info("> {}", ic.getMethod());
		return ic.proceed();
	}
}