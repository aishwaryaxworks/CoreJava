package com.xworkz.interfaces.things;

import com.xworkz.interfaces.interfaces.Animals;
import com.xworkz.interfaces.interfaces.Cat;
import com.xworkz.interfaces.interfaces.Tiger;

public class Dog implements Animals,Tiger, Cat{
public Dog() {
	System.out.println("Dog type constructor.");
}
}
