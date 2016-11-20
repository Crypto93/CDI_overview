package cdi.demos;

import cdi.demos.qualifiers.BiseraAdvancedQualifier;
import cdi.demos.qualifiers.BiseraAdvancedQualifier.BiseraTimeExecution;

@BiseraAdvancedQualifier(biseraTimeExecution=BiseraTimeExecution.LAST_15_PM)
public class BiseraLast implements Transport {
	
	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using BISERA LAST_15_PM";
	}

}
