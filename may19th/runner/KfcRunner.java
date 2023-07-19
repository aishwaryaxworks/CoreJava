package com.xworks.may19th.runner;

import com.xworks.may19th.things.Kfc;
import com.xworks.may19th.things.WingsBucket;

public class KfcRunner extends WingsBucket{

	public static void main(String[] args) {
		Kfc kfc1 = new KfcRunner();
		
		String[] employee1 = {"abc","bcd","cde"};
		kfc1.employeeName= employee1;
		kfc1.hasDriveThru=true;
		kfc1.deliveryAvailable();
		
		Kfc kfc2 = new WingsBucket();
		String[] employee2 = {"uvw","xyz","pqr"};
		kfc2.employeeName = employee2;
		kfc2.hasDriveThru=false;
		kfc2.deliveryAvailable();
		
		WingsBucket kfc3 = new WingsBucket();
		
		kfc3.delivery();
		kfc3.employees();
		
		

	}

}
