package com.uttara.Interfaces;

import java.util.ArrayList;

public class Competion {			// Implements hasA relationship rather than a isA relationship.
	String name;
	ArrayList<Performer> performers;
	int count;
	
	public Competion(String n, int num) {
		name = n;
		performers = new ArrayList<Performer>(num);
	}
	
	public void addPerformer(Performer pf) {
		performers.add(pf);
		count++;
	}
	
	public void start() {
		System.out.println("Starting competition of name: " + name);
		for (Performer PF : performers)
		{
			PF.perform();
		}
		System.out.println("There were a total of : " + count + " performers");
	}
}
