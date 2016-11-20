package cdi.demos;

import cdi.demos.qualifiers.BiseraQualifier;

@BiseraQualifier
public class Bisera implements Transport {
	
	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using BISERA";
	}
	
}
