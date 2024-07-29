package encapsulation;

public class Account {
	private int balance;
	private int accno;
	private int withdraw;
	public int getbalance() {
	return balance;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public int getaccno() {
	return accno;
	}
	public void setaccno(int accno) {
		this.accno=accno;
	}
	public int getwithdraw() {
	return withdraw;
	}
	public void setwithdraw(int withdraw) {
		this.withdraw=withdraw;
	}

	public static void main(String[] args) {
		Account o=new Account();
		o.setbalance(10000);
		o.setaccno(545656);
		o.setwithdraw(1000);
		int a=o.getaccno();
		int b=o.getbalance();
		int c=o.getwithdraw();
System.out.println("Balance is:"+b);
System.out.println("accno:"+a);

System.out.println("withdraw amount is:"+c);

	}

}
