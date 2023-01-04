package com.sgtesting.constructivechaining;
class player
{
	player(String name)
	{
		System.out.println("player name: "+name);
	}
	player(int age,String type)
	{
		this("vk");
		System.out.println("age: "+age+" type: "+type);
	}
	player(String nickname,int noofruns)
	{
		this(32,"batsman");
		System.out.println("nickname: "+nickname+" noofruns: "+noofruns);
	}
}
public class ConstChainingPlayer {

	public static void main(String[] args) {
		
		player a1=new player("vk");
		player a2=new player("chikoo",24000);
		
	}

}
