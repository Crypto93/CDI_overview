package cdi.demos;

import cdi.demos.multiple.qualifiers.BiseraQualifier;
import cdi.demos.multiple.qualifiers.First_10_AM;

@BiseraQualifier @First_10_AM
public class BiseraFirst implements Transport {
	
	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using BISERA FIRST_10_AM";
	}
	
}
