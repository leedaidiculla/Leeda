package interfaceProgram;

public class BankImp implements Bank,BankTwo{
	
	public void credit() {
		System.out.println("Print the credit");
	}
	public void debit() {
		System.out.println("Print the debit");
	}
	public void loan() {
		System.out.println("Print the loan");
	}
	public void carLoan() {
		System.out.println("Print the car loan");
	}
	public void account() {
		System.out.println("Print the account");
	}

	public static void main(String[] args) {
		BankImp b =new BankImp();
		b.account();
		b.carLoan();
		b.credit();
		b.debit();
		b.loan();

	}

}
