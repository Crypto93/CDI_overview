package test;

import javax.inject.Inject;

public class TestInjectable {
	
	@Inject
	private InjectableObj injectableObj;
	
	public TestInjectable() {
	}
	
	public String print() {
		return injectableObj.print();
	}
	
	

}
