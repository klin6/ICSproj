

public class Timer {
		
		private EZImage IceCream;			// Member variable to store Ice Cream picture
		private int x, y, startx, starty;	// Member variables to store x, y, startx, starty
		private int destx, desty;			// Member variables to store destination values
		private long starttime;				// Member variable to store the start time
		private long duration;				// Member variable to store the duration
		private boolean interpolation;		// Member variable that is set to true if it is in the interpolation state
		
		// ********* SCALE
		private float currentScale = 1;
		private float destScale = 1;
		private float startScale = 1;
		private boolean interpolationScale;
		
		// Constructor for IceCream takes 3 parameters
		public Timer(String filename,int posx, int posy){
			
			// Set the current position of the cone
			x=posx;y=posy;

			// Create the image of the cone
			IceCream = EZ.addImage(filename, posx, posy);
			
			// Move it to the starting position. This is actually redundant.
			IceCream.translateTo(x,y);
			
			// Set interpolation mode to false initially
			interpolation = false;
			interpolationScale = false;
		}
		
		// Set the destination by giving it 3 variables
		// Dur means duration and is measured in seconds
		public void setDestination(int posx, int posy, long dur){
			
			// Set destination position and duration
			// Convert seconds to milliseconds
			destx = posx; desty = posy; duration = dur*1000;
			
			// Get the starting time (i.e. time according to your computer)
			starttime = System.currentTimeMillis();
			
			// Set the starting position of your cone
			startx=x; starty=y;
			
			// Set interpolation mode to true
			interpolation = true;
			interpolationScale = false;
		}
		
		// ********* SCALE
		public void setScale(float s, float dur){
			destScale = s;
			starttime = System.currentTimeMillis();
			startScale = currentScale;
			interpolationScale = true;
		}
		
		// If you're in interpolation state then return true, else false.
		public boolean moving() {
			return interpolation;
		}
		
		// ********* SCALE
		public boolean scaling() {
			return interpolationScale;
		
		}
		
		// This moves the ice cream cone based on the current time and elapsed time according to the interpolation equation
		public void go(){
			
			// If interpolation mode is true then do interpolation
			if (interpolation == true) {
				
				// Normalize the time (i.e. make it a number from 0 to 1)
				float normTime = (float) (System.currentTimeMillis() - starttime)/ (float) duration;
				
				// Calculate the interpolated position of the cone
				x = (int) (startx + ((float) (destx - startx) *  normTime));
				y = (int) (starty + ((float) (desty - starty) *  normTime));
				
				// If the difference between current time and start time has exceeded the duration
				// then the animation/interpolation is over.
				if ((System.currentTimeMillis() - starttime) >= duration) {
					
					// Set interpolation to false
					interpolation = false;
					
					// Move the cone all the way to the destination
					x = destx; y = desty;
				}
				// move the image itself.
				IceCream.translateTo(x,y);	
			}
			
			// ********* SCALE
			if (interpolationScale == true){
				// Normalize the time (i.e. make it a number from 0 to 1)
				float normTime = (float) (System.currentTimeMillis() - starttime)/ (float) duration;
				
				// Calculate the interpolated position of the cone
				currentScale =  (startScale + ((float) (destScale - startScale) *  normTime));

				
				// If the difference between current time and start time has exceeded the duration
				// then the animation/interpolation is over.
				if ((System.currentTimeMillis() - starttime) >= duration) {
					
					// Set interpolation to false
					interpolationScale = false;
					
					// Scale the cone all the way to the destination
					currentScale = destScale;
				}
				// move the image itself.
				IceCream.scaleTo(currentScale);	
			}
			
		}
		
		
		
		
}

