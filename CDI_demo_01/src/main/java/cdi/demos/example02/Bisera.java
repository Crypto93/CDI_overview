package cdi.demos.example02;

import javax.enterprise.inject.Default;

@Default
public class Bisera implements Transport {
	
	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using RINGS";
	}
	
}
