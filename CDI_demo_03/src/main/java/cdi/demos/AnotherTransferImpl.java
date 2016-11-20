package cdi.demos;

import javax.enterprise.inject.Alternative;

@Alternative
public class AnotherTransferImpl implements Transport {

	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using Another implementation";
	}

}
