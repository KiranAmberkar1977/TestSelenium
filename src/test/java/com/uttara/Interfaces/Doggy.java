package com.uttara.Interfaces;

public class Doggy implements Pet
{
	public void barky()
	{
		System.out.println("woof woof");
	}

	@Override
	public void play() {
		System.out.println("Doggy playing...");
	}
	
}

