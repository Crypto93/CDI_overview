package cdi.demos;

import javax.enterprise.inject.Alternative;

@Alternative
public class Rings implements Transport {

	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using RINGS";
	}
	
}
