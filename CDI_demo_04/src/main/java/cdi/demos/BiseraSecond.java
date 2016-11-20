package cdi.demos;

import cdi.demos.qualifiers.BiseraAdvancedQualifier;
import cdi.demos.qualifiers.BiseraAdvancedQualifier.BiseraTimeExecution;

@BiseraAdvancedQualifier(biseraTimeExecution=BiseraTimeExecution.SECOND_13_PM)
public class BiseraSecond implements Transport {
	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using BISERA SECOND_13_PM";
	}
}
