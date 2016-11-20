package cdi.demos;

import javax.enterprise.inject.Produces;

public class PriceProducer {

	@Produces
	@StandardBook
	public double standardPrice = 99.99;
	
	@Produces
	@LuxuriousBook
	public double luxPrice = 199.99;
	
}
