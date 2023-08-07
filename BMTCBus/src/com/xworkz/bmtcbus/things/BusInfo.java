package com.xworkz.bmtcbus.things;

public interface BusInfo extends BusMaintainance,CompanyInfo, RouteInfo,BusDriver,RouteSchedule{
	public static void infoMethod() {
		System.out.println("Bus Info method.");
	}

}
