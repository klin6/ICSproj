import java.awt.Color;

public class Intro {
	static Thread thread = new Thread();
	
	public static void Countdown () throws InterruptedException{
		for (int n = 5; n>=0; n--){//set integer n =5. run for loop as long as n is >= 0.reducing by 1
			thread.sleep(1000);	//put thread to sleep for 1 second
			EZ.addText(500, 500, "Start in: " + n, Color.BLACK, 72);
			System.out.print("Starting in:" + n);
		}
		//refresh screen
			EZ.refreshScreen();
	}

	}
