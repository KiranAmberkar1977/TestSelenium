package com.uttara.Interfaces;

public class Juggler implements Performer {
	public int num_balls;
	String name;
	
	public Juggler(String name, int ball_count) {
		this.num_balls = ball_count;
		this.name = name;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler of name: " + name + " juggling - " + num_balls + " balls");
	}

}
