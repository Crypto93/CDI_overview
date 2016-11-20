package cdi.demos;

import javax.inject.Inject;

public class PersonalBankAccount {

	@Inject
	private Transport transport;

	
	/*@Inject
	public PersonalBankAccount(Transfer transfer) {
		super();
		this.transfer = transfer;
	}*/
	
	/*@Inject
	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}*/

	public String deposit() {
		return "\n###Deposit Operation\n#" + transport.sendTransportRequest();
	}

	public String withdraw() {
		return "\n###Withdraw operation \n#" + transport.sendTransportRequest();
	}

}