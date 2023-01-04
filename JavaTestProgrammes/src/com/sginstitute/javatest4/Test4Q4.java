package com.sginstitute.javatest4;
class encapsulation
{
	private int password;
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
public class Test4Q4 {

	public static void main(String[] args) {

		encapsulation a1=new encapsulation();

		a1.setPassword(226);
		int a=a1.getPassword();
		System.out.println(a);

		a1.setName("niki");
		String n=a1.getName();
		System.out.println(n);

	}

}
