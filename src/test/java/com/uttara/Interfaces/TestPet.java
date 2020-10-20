package com.uttara.Interfaces;

public class TestPet {

	public static void main(String[] args) {
		System.out.println(Pet.NAME); // with it print the name or not, check.
		Doggy p = new Doggy(); // will this compile? check.
		
		p.barky();
		p.play();
	}
}
