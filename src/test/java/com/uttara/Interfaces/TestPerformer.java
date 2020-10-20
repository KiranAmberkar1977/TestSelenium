package com.uttara.Interfaces;

public class TestPerformer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Performer pf = new Juggler("Sircar", 10);
		pf.perform();
		
		pf = new Actor("Salman", 200);
		pf.perform();
		
	}
}
