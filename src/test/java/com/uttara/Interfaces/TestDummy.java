package com.uttara.Interfaces;

public class TestDummy {

	public static void main(String[] args) {
		Dummy dobj = new Dummy(30);
		System.out.println("R value is: " + Dummy.R);
		System.out.println("p value is: " + dobj.getVal());
		//dobj.p = 50;
	}
}
