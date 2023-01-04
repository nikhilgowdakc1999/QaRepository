package com.sgtesting.Polymorphism2;
abstract class Animalsounds2
{
	abstract void sound();
}
class Dog extends Animalsounds2
{
	void sound()
	{
		System.out.println("Dog sound:Bow-Bow");
	}
}
class Cat extends Animalsounds2
{
	void sound()
	{
		System.out.println("cat sound:meow");
	}
}
class horse extends Animalsounds2
{
	void sound()
	{
		System.out.println("horse sound:Kneeze");
	}
}
public class AnimalSounds {

	public static void main(String[] args) {
		
		Animalsounds2 sound=null;
		
		sound=new Dog();
		sound.sound();
		sound=new Cat();
		sound.sound();
		sound=new horse();
		sound.sound();
		

	}

}
