package com.xworkz.afternoon.things;

public class Cement implements Cloneable{
	private String brandName;
	private String grade;
	private int bagSizeInKilos;
	private double settingTime;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getBagSizeInKilos() {
		return bagSizeInKilos;
	}
	public void setBagSizeInKilos(int bagSizeInKilos) {
		this.bagSizeInKilos = bagSizeInKilos;
	}
	public double getSettingTime() {
		return settingTime;
	}
	public void setSettingTime(double settingTime) {
		this.settingTime = settingTime;
	}
	
	@Override
	public String toString() {
		return "Cement [brandName=" + brandName + ", grade=" + grade + ", bagSizeInKilos=" + bagSizeInKilos
				+ ", settingTime=" + settingTime + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("This is clone method !");
		Cement cement = (Cement)super.clone();
		return super.clone();
	}
}
