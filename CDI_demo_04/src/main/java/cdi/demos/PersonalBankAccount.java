package cdi.demos;

import javax.inject.Inject;

import cdi.demos.qualifiers.BiseraAdvancedQualifier;
import cdi.demos.qualifiers.BiseraAdvancedQualifier.BiseraTimeExecution;

public class PersonalBankAccount {

	@Inject @BiseraAdvancedQualifier(biseraTimeExecution=BiseraTimeExecution.LAST_15_PM)
	private Transport transport;
	
	public String deposit() {
		return "\n###Deposit Operation\n#" + transport.sendTransportRequest();
	}

	public String withdraw() {
		return "\n###Withdraw operation \n#" + transport.sendTransportRequest();
	}

}
