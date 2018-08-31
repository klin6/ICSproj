
public class isRunnin {
	static boolean isRunning=true;	//declare a boolean called isRunning to true
	static Timer cone = new Timer("ice cream cone.png", 1000,550);	//create a new Timer image
	public static boolean isRunning(){
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
			
			// Using my bug object call the member function setDestination and give 
			// it the parameter values x, y, and dur
			cone.setDestination(x, y, dur);
			
			//if cone is moving and scaling then isRunning==false
			if(cone.moving()==false&&cone.scaling()==false){
				isRunning=false;
			}
			}
		//return boolean isRunning
		return isRunning;
	}
}
