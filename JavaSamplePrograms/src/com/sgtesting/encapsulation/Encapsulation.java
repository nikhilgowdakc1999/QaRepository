package com.sgtesting.encapsulation;
class bank
{
	String bankname;
	//select accountno and click on source to generate setter and getter 
	private int accountno;

	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
}
public class Encapsulation {

	public static void main(String[] args) {

		bank central=new bank();
		central.bankname="sbi";
		System.out.println(central.bankname);
		central.setAccountno(100011);
		int accountno=central.getAccountno();
		System.out.println(accountno);

	}

}
