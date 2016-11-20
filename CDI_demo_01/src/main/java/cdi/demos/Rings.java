package cdi.demos;

public class Rings implements Transport {

	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using RINGS";
	}
}
