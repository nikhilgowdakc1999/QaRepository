package com.sgtesting.constructiveoverloading;
class player
{
	player(String name)
	{
		System.out.println("player name: "+name);
	}
	player(int age,String type)
	{
		System.out.println("age: "+age+" type: "+type);
	}
	player(String nickname,int noofruns)
	{
		System.out.println("nickname: "+nickname+" noofruns: "+noofruns);
	}
}
public class ConstOverloadingPlayer {

	public static void main(String[] args) {

		player a1=new player("virat kohli");
		player a2=new player(32,"batsman");
		player a3=new player("cheeku",24000);

	}

}
