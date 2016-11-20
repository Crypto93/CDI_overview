package cdi.demos;

import javax.enterprise.inject.Default;

@Default
public class Bisera implements Transport {
	
	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using BISERA";
	}
	
}
