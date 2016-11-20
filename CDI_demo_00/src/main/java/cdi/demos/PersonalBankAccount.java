package cdi.demos;

public class PersonalBankAccount {

	private Transport transport;

	
	public PersonalBankAccount(Transport transport) {
		super();
		this.transport = transport;
	}
	

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public String deposit() {
		return "\n###Deposit Operation\n#" + transport.sendTransportRequest();
	}

	public String withdraw() {
		return "\n###Withdraw operation \n#" + transport.sendTransportRequest();
	}

}
