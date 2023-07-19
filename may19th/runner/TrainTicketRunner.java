package com.xworks.may19th.runner;

import com.xworks.may19th.things.TrainClasses;
import com.xworks.may19th.things.TrainTicket;
import com.xworks.may19th.things.TrainType;

public class TrainTicketRunner {

	public static void main(String[] args) {
		TrainTicket ticket1 = new TrainTicket();
		ticket1.displayTicket();
		
		TrainTicket ticket2 = new TrainTicket("MYS","GOA","12-07-2023",TrainClasses.EA,TrainType.GEN);
		ticket2.displayTicket();
		
		TrainTicket ticket3 = new TrainTicket("DEL","ATS");
		ticket3.displayTicket();
		
		TrainTicket ticket4 = new TrainTicket();
		ticket4.setType(TrainType.DISABLED_PERSON);
		ticket4.displayTicket();
		

	}

}
