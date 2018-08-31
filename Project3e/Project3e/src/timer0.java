
public class timer0 extends Thread{
	
	static Timer cone = new Timer("ice cream cone.png", 1000,550);// Create an Timer object and give it the image and starting position 
	static boolean exit = false; // Set exit variable to false.
	public void run(){
	{
			// Declare variables x,y,dur for later use.
			int x, y;
			int dur;
			float s;
			
				// Read first integer and store that in x.
				x = 50;
				
				// Read second integer and store that in y.
				y = 550;
				
				// Read third integer and store that in dur (duration).
				dur = 30;
				
				// Using my Timer object call the member function setDestination and ggive parameter values x, y, and dur
				cone.setDestination(x, y, dur);
			
			}
	
	{
			
			// While the cone should be moving...
			// ********* SCALE
			
			while(cone.moving() || cone.scaling()){
				
				// Call the go member function of the Timer to make it move.
				cone.go();
				
				// Refresh the screen
				EZ.refreshScreen();
			}
			//while cone is moving game will not exit
			while(cone.moving()==false){
				exit=true;
			}
			}
			
			// If exit is NOT true then keep looping.
		 while(exit != true);
		
}
	//isRunning boolean to exit game when time is up
	public static boolean isRunning() {
		return exit;
		
	}
	}	
	

