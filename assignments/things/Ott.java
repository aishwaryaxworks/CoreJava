package com.xworkz.assignments.things;

public class Ott {
	String showName;
	int releaseMonth;
	
	public Ott() {
		System.out.println(getClass());
		System.out.println("Ott class constructor.");
	}

	public Ott(String showName, int releaseMonth) {
		this.showName = showName;
		this.releaseMonth = releaseMonth;
	}
	
	@Override
	public String toString() {
		return "Ott [show name:'"+showName+"', Release Year:'"+releaseMonth+"']";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Ott o = (Ott)obj;
		if(this.showName == o.showName && this.releaseMonth == o.releaseMonth)
			return true;
		return false;
	}

}
