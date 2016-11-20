package cdi.demos;

import javax.inject.Inject;

import cdi.demos.qualifiers.BiseraQualifier;


public class PersonalBankAccount {

	@Inject @BiseraQualifier
	private Transport transport;
	
	public String deposit() {
		return "\n###Deposit Operation\n#" + transport.sendTransportRequest();
	}

	public String withdraw() {
		return "\n###Withdraw operation \n#" + transport.sendTransportRequest();
	}

}
