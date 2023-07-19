package com.xworkz.inheritance.things;

public class Google extends Object{

	public int hashCode() {
		return 800;
	}
	public boolean equals(Object obj) {
		return (obj=="IronMan");
	}

	// public String toString() {
	//	 return "Hello";
	// }

	public Object clone() {
		return "this is clone";
	}
	
	public void finalize() {
		System.out.println("this is finalize()");
	}

	public static void main(String[] args) {

		Google obj = new Google();
		Google obj1 = new Google();
		boolean val= obj.equals(obj1);
		System.out.println(val);
		System.out.println(obj.getClass());
		int hashcode=obj.hashCode();
		System.out.println(hashcode);
		String sts=obj.toString();
		System.out.println(sts);

		System.out.println(obj.clone());
		obj.finalize();


	}


}

