public class keyCheck {
	static EZImage flavor[]=setOrder.flavor(); //call on flavor array from setOrder
	static boolean isRunning=timer0.isRunning();//call on isRunning boolean from timer0
	 
	public static boolean keyCheck0(){//member boolean function called keyCheck0
		char scoop[]=setOrder.setOrder();//create a char array of 4 elements from setOrder
		
		char notscoop[][]=setOrder.NotOrder();//declare 2D char array to 4x3 from setOrder
		boolean keyCheck0=false;//set keyCheck0 boolean to false
		System.out.println(scoop[0]);//print out line index 0 of scoop array
		while(true){
			isRunning=timer0.isRunning();
			 if(EZInteraction.wasKeyPressed(scoop[0])&&isRunning==false){	//if char in scoop array of index 0 wasKeyPressed and isRunning==false, flavor array image will show
				System.out.println("correct");
				keyCheck0=true;
				flavor[0].show();
				System.out.println(keyCheck0);
				
				break;
				
			 }else if(EZInteraction.wasKeyPressed(notscoop[0][0])||EZInteraction.wasKeyPressed(notscoop[0][1])||EZInteraction.wasKeyPressed(notscoop[0][2])||isRunning==true){ 
				 //else if isRunning==true and wasKeyPressed not the same as notscoop char 2D array then a new random number and flavor array image will appear
			
				 System.out.println("wrong");
				 for(int i=0;i<4;i++){
					flavor[i].hide();
				 }
				 orderGen.getCombo();
				 setOrder.flavor();
				 break;
			 }	
			//refresh screen
			EZ.refreshScreen();
		}
		//return boolean function keyCheck0
		return keyCheck0;
	}
	
	public static boolean keyCheck1(){//member boolean function called keyCheck1
		char scoop[]=setOrder.setOrder();//create a char array of 4 elements from setOrder
		
		char notscoop[][]=setOrder.NotOrder();//declare 2D char array to 4x3 from setOrder
		boolean keyCheck1=false;//set keyCheck1 boolean to false
		System.out.println(scoop[1]);//print out line index 1 of scoop array
		while(true){
			isRunning=timer0.isRunning();
			 if(EZInteraction.wasKeyPressed(scoop[1])&&isRunning==false){//if char in scoop array of index 1 wasKeyPressed and isRunning==false, flavor array image will show
				System.out.println("correct");
				keyCheck1=true;
				flavor[1].show();
				System.out.println(keyCheck1);
				break;
				
			 }else if(EZInteraction.wasKeyPressed(notscoop[1][0])||EZInteraction.wasKeyPressed(notscoop[1][1])||EZInteraction.wasKeyPressed(notscoop[1][2])||isRunning==true){
				 //else if isRunning==true and wasKeyPressed not the same as notscoop char 2D array then a new random number and flavor array image will appear
				 System.out.println("wrong");
				 for(int i=0;i<4;i++){
					 flavor[i].hide();
				 }
				 
				 orderGen.getCombo();
				 setOrder.flavor();
				 break;
			 }	
			//refresh screen
			EZ.refreshScreen();
		}
		//return boolean function keyCheck1
		return keyCheck1;
	}
	
	
	public static boolean keyCheck2(){//member boolean function called keyCheck2
		char scoop[]=setOrder.setOrder();//create a char array of 4 elements from setOrder
		
		char notscoop[][]=setOrder.NotOrder();//declare 2D char array to 4x3 from setOrder
		boolean keyCheck2=false;//set keyCheck2 boolean to false
		System.out.println(scoop[2]);//print out line index 2 of scoop array
		while(true){
		
			isRunning=timer0.isRunning();
			 if(EZInteraction.wasKeyPressed(scoop[2])&&isRunning==false){//if char in scoop array of index 2 wasKeyPressed and isRunning==false, flavor array image will show
				System.out.println("correct");
				keyCheck2=true;
				flavor[2].show();
				
				System.out.println(keyCheck2);
				
				break;
			 }else if(EZInteraction.wasKeyPressed(notscoop[2][0])||EZInteraction.wasKeyPressed(notscoop[2][1])||EZInteraction.wasKeyPressed(notscoop[2][2])||isRunning==true){
				 //else if isRunning==true and wasKeyPressed not the same as notscoop char 2D array then a new random number and flavor array image will appear
				 System.out.println("wrong");
				 for(int i=0;i<4;i++){
					 flavor[i].hide();
				 }
				 
				 orderGen.getCombo();
				 setOrder.flavor();
				 break;
			 }	
			//refresh screen
			EZ.refreshScreen();
		}
		
		//return boolean function keyCheck2
		return keyCheck2;
	}
	
	
	public static boolean keyCheck3(){//member boolean function called keyCheck3
		char scoop[]=setOrder.setOrder();//create a char array of 4 elements from setOrder
		
		char notscoop[][]=setOrder.NotOrder();//declare 2D char array to 4x3 from setOrder
		boolean keyCheck3=false;//set keyCheck3 boolean to false
		System.out.println(scoop[3]);//print out line index 3 of scoop array
		while(true){
			
			isRunning=timer0.isRunning();
			 if(EZInteraction.wasKeyPressed(scoop[3])&&isRunning==false){//if char in scoop array of index 3 wasKeyPressed and isRunning==false, flavor array image will show
				 flavor[3].show();
				System.out.println("correct");
				keyCheck3=true;
				System.out.println(keyCheck3);
				System.out.println("win");
				
				
				EZ.pause(1000);//pause for 4th flavor image array to show 1 second
				
			for(int i=0;i<4;i++){
					 flavor[i].hide();
				 }
				orderGen.getCombo();
				setOrder.flavor();
				
				break;
			 }else if(EZInteraction.wasKeyPressed(notscoop[3][0])||EZInteraction.wasKeyPressed(notscoop[3][1])||EZInteraction.wasKeyPressed(notscoop[3][2])||isRunning==true){
				 //else if isRunning==true and wasKeyPressed not the same as notscoop char 2D array then a new random number and flavor array image will appear
				 System.out.println("wrong");
				 for(int i=0;i<4;i++){
					 flavor[i].hide();
				 }
				 
				 orderGen.getCombo();
				 setOrder.flavor();
				 break;
			 }	
			//refresh screen
			EZ.refreshScreen();
		}
		
		//return boolean function keyCheck3
		return keyCheck3;
	}
	
}
