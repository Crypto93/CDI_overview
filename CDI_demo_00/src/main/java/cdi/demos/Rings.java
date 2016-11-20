package cdi.demos;

public class Rings implements Transport {
	
	public Rings() {
	}

	@Override
	public String sendTransportRequest() {
		return "Sending trasnport Request using RINGS";
	}
}
