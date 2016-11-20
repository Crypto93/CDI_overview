package cdi.demos;

import javax.inject.Inject;

public class PersonalBankAccount {

	@Inject
	private Transport transport;

	
/*	@Inject
	public PersonalBankAccount(Transport transport) {
		super();
		this.transport = transport;
	}*/
	
/*	@Inject
	public void setTransfer(Transport transport) {
		this.transport = transport;
	}
*/
	public String deposit() {
		return "\n###Deposit Operation\n#" + transport.sendTransportRequest();
	}

	public String withdraw() {
		return "\n###Withdraw operation \n#" + transport.sendTransportRequest();
	}

}
