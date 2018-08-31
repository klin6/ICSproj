import java.util.Random;
public class orderGen {
	
		public static Random randGen = new Random();
 		//create object randGen of type Random
		public static int flavors[]=new int[4];
		//create array of 4 integers named flavors
		public static int[] getCombo(){ //member function 
			for(int i=0;i<4;i++){ //for loop from 0 to 3
				flavors[i]=randGen.nextInt(4);//generate a random integer from 0 to 3
			}
			return flavors; //return array flavors
			}
		}
