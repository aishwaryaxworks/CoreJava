package com.xworkz.abstraction.things;

public class Tea extends TeaTime{
	@Override
	public void waiting() {
		System.out.println("this is subclass tea implementation of waiting method.");
	}

}
