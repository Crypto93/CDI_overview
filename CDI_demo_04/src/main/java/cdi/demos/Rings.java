package cdi.demos;

import cdi.demos.qualifiers.RingsQualifier;

@RingsQualifier
public class Rings implements Transport {

	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using RINGS";
	}
	
}
