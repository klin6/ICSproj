/*

TODO LIST:
1. fix images
2. timer
3.









 ** Score board **




 */

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Collections;
import java.lang.IndexOutOfBoundsException;

public class main {
	
	
	public static void main(String[] args) throws InterruptedException, IOException{
		int[] combo=orderGen.getCombo(); //set combo array to call on random integer from orderGen
		
		int score = 0;	//declare integer variable called score, set to 0


		// TODO Auto-generated method stub
		EZ.initialize(1038,584);	// Setup EZ graphics system.
		EZ.addImage("Background.png",519,292);// Set background image at 519, 292
		EZSound magic=EZ.addSound("magic-chime-01.wav");	//add sound for new flavor combinations
		EZSound tune=EZ.addSound("background.wav");	//add background audio
		tune.play();	//play background audio
		EZText tbox=EZ.addText(675, 498, "Score: " + score, Color.BLACK, 45);	//add textbox in EZ graphics to record score
		EZText tbox2 = EZ.addText(500, 100, "Start in: ", Color.BLACK, 72);	//add textbox in graphics to show countdown	
		
		Thread thread = new Thread();	//declare a new thread
		for (int n = 5; n>=0; n--){	//set integer n =5. run for loop as long as n is >= 0.reducing by 1
			thread.sleep(1000);	//put thread to sleep for 1 second
			
			tbox2.setMsg("Start in: " + n);	//textbox display will countdown from 5 to 0
			System.out.print("Starting in:" + n);

		}
		//refresh screen
		EZ.refreshScreen();

		timer0 timer = new timer0();		//set a new timer object

		tbox2.hide();	//when countdown reached, textbox will hide 

		timer.start();	//start timer thread after countdown textbox hides
		magic.play();	//play magic audio
		boolean isRunning=timer0.isRunning();	//call on isRunning boolean from timer0 class
		magic.play();	//play magic audio
		while (isRunning!=true){	//while isRunning==false timer will run,otherwise will break
			isRunning=timer0.isRunning();	//update isRunning
			magic.play();
			if(isRunning==true){		//if isRunning==true, stop game
				break;
			}
			tbox.setMsg( "Score: " + score);	//score textbox will display score
			isRunning=timer0.isRunning();	//timer0 thread will run
			magic.play();		//play magic audio
			if(isRunning==true){		//if isRunning==true, stop game
				break;
			}
			isRunning=timer0.isRunning();  //update isRunning
			magic.play();		//play magic audio
			if(keyCheck.keyCheck0()==true&&keyCheck.keyCheck1()==true&&keyCheck.keyCheck2()==true&&keyCheck.keyCheck3()==true){	//if keyCheck member boolean functions are all equal true, timer thread will run 
				isRunning=timer0.isRunning();	//update isRunning
				
				if(isRunning==false){			//check again for isRunning before giving score
				score++;
				
				System.out.println("Score: " + score);	
				EZ.refreshScreen();
			}else if(isRunning==true){		//check for isRunning
				break;
			}

			}
		}
		tune.stop();	//stop background audio
		Scanner sc = new Scanner(new FileReader("scoreboard.txt")); //create a scanner which will scan "scoreboard.txt"
		FileWriter writer = new FileWriter("scoreboard.txt",true);	//create a file writer whill will write to the txt file
		ArrayList<Integer> scoreboard = new ArrayList<Integer>();	//create a new array list for the scores
		while (sc.hasNextInt()) {
	        scoreboard.add(sc.nextInt());		//scan all of the integers and store them into the array list
	    }
		scoreboard.add(score);					//also add the score into the array list
	    Collections.sort(scoreboard);			//sort the scores in ascending order
	    Collections.reverse(scoreboard);		//reverse the order so it goes from greatest to least
	    PrintWriter erase = new PrintWriter("scoreboard.txt");		//make a new print writer
	    erase.print("");					//reset the txt document
	    erase.close();						//close print writer
	    for(int i=0;i<scoreboard.size();i++){	
	    	writer.write(" "+scoreboard.get(i));	//write the array list into the txt doc
	    }
	    
		EZ.addRectangle(516, 292, 1038, 584, Color.BLACK, true);		//set background
		EZ.addText(200, 292, "Your Score is: "+score, Color.WHITE, 50);	//show player's score
		EZ.addText(700,200,"Top Scores",Color.WHITE,100);				//title for top score
		EZ.addText(700,320,"1.  "+scoreboard.get(0),Color.white,50);	//show top 3 scores
		EZ.addText(700,430,"2.  "+scoreboard.get(1),Color.white,50);	
		EZ.addText(700,540,"3.  "+scoreboard.get(2),Color.white,50);
		sc.close();			//close scanner
	    writer.close();		//close file writer
	}

}