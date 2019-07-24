package los.start;

import los.operation.LOSProcess;
import los.utils.Utility;
import static los.utils.Utility.scan;


public class Application {

	public static void main(String[] args) {
		LOSProcess process=new LOSProcess();
		System.out.println("\t\t\t **WELCOME USER**");
		while(true) {
		System.out.println("\nWhat is your Application Number ? \npress 0 if new customer \npress -1 to exit ");
		int applicationNumber=scan.nextInt();
		if(applicationNumber==-1) {
			System.out.println("\n\t\t\t**Thanks for using**");
			System.exit(0);
		}
		if(applicationNumber==0) {
			//new customer
			process.sourcing();
		}
		else {
			//existing customer
			process.checkStage(applicationNumber);
		}
		}
			
	}

}
