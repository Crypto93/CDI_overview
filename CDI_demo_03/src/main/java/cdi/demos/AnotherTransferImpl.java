package cdi.demos;

import javax.enterprise.inject.Alternative;

import cdi.demos.qualifiers.BiseraQualifier;
import cdi.demos.qualifiers.RingsQualifier;

@Alternative @BiseraQualifier @RingsQualifier
public class AnotherTransferImpl implements Transport {

	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using Another implementation";
	}

}
