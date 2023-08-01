package com.xworkz.abstraction.things;

public class Coffee extends TeaTime{
	@Override
	public void waiting() {
		System.out.println("this is subclass coffee implementation of waiting method.");
	}

}
