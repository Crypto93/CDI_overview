package cdi.demos;

public class App {

	public static void main(String[] args) {

		Transport transport = new Bisera();
		PersonalBankAccount bankAccount = new PersonalBankAccount(transport);

		System.out.println(bankAccount.deposit());
		System.out.println(bankAccount.withdraw());

	}

}
