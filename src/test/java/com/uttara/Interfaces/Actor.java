package com.uttara.Interfaces;

public class Actor implements Performer {
	public int num_movies;
	String name;
	
	public Actor(String name, int movie_count) {
		this.num_movies = movie_count;
		this.name = name;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Actor of name: " + name + " acted in - " + num_movies + " movies");
	}

}
