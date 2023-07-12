package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.ArtificialIntelligence;
//import com.xworkz.inheritance.things.ChatGPT;
//import com.xworkz.inheritance.things.GoogleTalkback;
//import com.xworkz.inheritance.things.BeautyPlus;
//import com.xworkz.inheritance.things.Shazam;
import com.xworkz.assignments.things.MIRemote;

/*public class AIRunner extends ChatGPT{

	public static void main(String[] args) {
		AIRunner ai = new AIRunner();
		ai.contextSize = 2000;
	}
}*/

/*public class AIRunner extends GoogleTalkback {
	public static void main(String[] args) {
		AIRunner ai = new AIRunner();
		String[] hardware = { "Microphone", "Speaker" };
		ai.hardwareRequirements = hardware;
	}
}*/

/*public class AIRunner extends BeautyPlus {
	public static void main(String[] args) {
		AIRunner ai = new AIRunner();
		ai.beautyLevel = 5;
	}
}*/

/*public class AIRunner extends Shazam {
	public static void main(String[] args) {
		AIRunner ai = new AIRunner();
		ai.isListening=true;
	}
}*/

public class AIRunner extends MIRemote {
	public static void main(String[] args) {
		AIRunner ai = new AIRunner();
		ai.batteryLevel=49;
		
		ArtificialIntelligence ai1 = new ArtificialIntelligence();
		ai1.displayAI();
		ArtificialIntelligence ai2 = new MIRemote();
		ai2.displayAI();
	}
}
