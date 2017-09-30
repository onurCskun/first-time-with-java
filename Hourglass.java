package juicebox;

public class Hourglass {
	public static void main(String[] args) {
		printHourglass(10);
	}
	
	public static void printHourglass(int width){
		if(width <= 0) return;
		
		for (int line = 0; line <= width; line++) {

			int k = line;
			if(line > width / 2) k = width - k;

			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= width-2*k; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}
}
/** output = 
***********
 ********* 
  *******  
   *****   
    ***    
     *     
    ***    
   *****   
  *******  
 ********* 
***********
*/