package cdi.demos.example02;

import javax.inject.Inject;

public class PersonalBankAccount {

	@Inject
	private Transport trasnport;

	
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
		return "\n###Deposit Operation\n#" + trasnport.sendTransportRequest();
	}

	public String withdraw() {
		return "\n###Withdraw operation \n#" + trasnport.sendTransportRequest();
	}

}
