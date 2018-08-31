public class setOrder {
	static int[] combo=orderGen.getCombo();//set combo to call a random integer
	static EZImage[] flavor=new EZImage[4];//declare a EZImage array of 4 elements called flavor
	public static EZImage[] flavor(){
		 
			for(int i=0;i<4;i++){
				flavor[i]=null;
			}
		int[] levelY=new int[4];{	// create an array of 4 integers called levelY
			levelY[0]=330;	//set index 0 of levelY array to 90
			levelY[1]=250;	//set index 1 of levelY array to 170
			levelY[2]=170;	//set index 2 of levelY array to 250
			levelY[3]=90;	//set index 3 of levelY array to 330
			}
		
		
		for(int i=0;i<4;i++){										//set integer i =0. run for loop as long as i is < 4.
			if(combo[i]==0){
				flavor[i]=EZ.addImage("Carrot.png",430,levelY[i]);
				flavor[i].hide();
				continue;
				
			}else if(combo[i]==1){									//if random number is 1, set scoop[i] to char a and print image
				flavor[i]=EZ.addImage("Strawberry.png",430,levelY[i]);
				flavor[i].hide();
				continue;
				
			}else if(combo[i]==2){									//if random number is 2, set scoop[i] to char s and print image
				flavor[i]=EZ.addImage("Chocolate.png", 430,levelY[i]);
				flavor[i].hide();
				continue;
				
				
			}else if(combo[i]==3){									//if random number is 3, set scoop[i] to char d and print image
				flavor[i]=EZ.addImage("GreenTea.png",430,levelY[i]);
				flavor[i].hide();
				continue;	
			}
			EZ.refreshScreen();
		}
		return flavor;
	}
	public static char[] setOrder(){
		char scoop[]=new char[4];					//create a char array of 4 elements
		
		int[] y=new int[4];{							//create an int array of 4 elements
			y[0]=350;
			y[1]=305;
			y[2]=260;
			y[3]=210;
			}
		EZImage[] carrot2=new EZImage[4];	// create an array of 4 EZImage called carrot2
		EZImage[] chocolate2=new EZImage[4];	// create an array of 4 EZImage called chocolate2
		EZImage[] greenTea2=new EZImage[4];	// create an array of 4 EZImage called greenTea2
		EZImage[] strawberry2=new EZImage[4];	// create an array of 4 EZImage called strawberry2
		{for(int j=0;j<4;j++){
			carrot2[j] =EZ.addImage("orange.png",590,y[j]);	// into location k of carrot array, add an image "orange.png" and coordinates 430,levelY[k]
			chocolate2[j]=EZ.addImage("brown.png", 590,y[j]);	// into location k of chocolate array, add an image "brown.png" at coordinates 430,levelY[k]
			greenTea2[j]=EZ.addImage("green.gif",590,y[j]);	// into location k of greenTea array, add an image "green.gif"at coordinates 430,levelY[k]
			strawberry2[j]=EZ.addImage("pink.png",590,y[j]);// into location k of strawberry array, add an image "pink.png"at coordinates 430,levelY[k]
			carrot2[j].hide();
			chocolate2[j].hide();
			strawberry2[j].hide();
			greenTea2[j].hide();
			}
		}
		
			
	for(int i=0;i<4;i++){										//set integer i =0. run for loop as long as i is < 4.
		if(combo[i]==0){
			scoop[i]='w';
			carrot2[i].show();
			chocolate2[i].hide();
			strawberry2[i].hide();
			greenTea2[i].hide();
			
		}else if(combo[i]==1){									//if random number is 1, set scoop[i] to char a and print image
			scoop[i]='a';
			strawberry2[i].show();
			carrot2[i].hide();
			chocolate2[i].hide();
			greenTea2[i].hide();
		}else if(combo[i]==2){									//if random number is 2, set scoop[i] to char s and print image
			scoop[i]='s';
			chocolate2[i].show();
			carrot2[i].hide();
			strawberry2[i].hide();
			greenTea2[i].hide();
		}else if(combo[i]==3){									//if random number is 3, set scoop[i] to char d and print image
			scoop[i]='d';
			greenTea2[i].show();
			carrot2[i].hide();
			chocolate2[i].hide();
			strawberry2[i].hide();
			
		}
	}
	
	
		return scoop;	//return the array of chars
}
	
	public static char[][] NotOrder() {
		char[][] notscoop=new char[4][3];
		
		for(int i=0;i<4;i++){										//set integer i =0. run for loop as long as i is < 4.
			if(combo[i]==0){										//if random number is 0, set scoop[i] to char w and print image
				notscoop[i][0]='a';
				notscoop[i][1]='s';
				notscoop[i][2]='d';		
			}
			else if(combo[i]==1){									//if random number is 1, set scoop[i] to char a and print image
				notscoop[i][0]='w';
				notscoop[i][1]='s';
				notscoop[i][2]='d';	
				
				
			}
			else if(combo[i]==2){									//if random number is 2, set scoop[i] to char s and print image
				notscoop[i][0]='a';
				notscoop[i][1]='w';
				notscoop[i][2]='d';	
				
				
			}
			else if(combo[i]==3){									//if random number is 3, set scoop[i] to char d and print image
				notscoop[i][0]='a';
				notscoop[i][1]='s';
				notscoop[i][2]='w';	
			}
		}
		
	return notscoop;//return array of chars
}	
	
}