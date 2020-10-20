package com.uttara.Interfaces;

public class TestCompetition {

	public static void main(String[] args) {
		
		Competion c1 = new Competion("Rangoli", 2);
		
		Performer pf = new Juggler("Sircar", 10);
		//pf.perform();
		c1.addPerformer(pf);
		
		pf = new Actor("Salman", 200);
		c1.addPerformer(pf);
		//pf.perform();
		
		pf = new Actor("Ritesh", 20);
		c1.addPerformer(pf);
			
		c1.start();
	}
}
