import java.util.Arrays;
import java.util.Random;

public class Homework {
public static void main(String[] args) {

   int number [] = new int [30]; 
   
    Random r1 = new Random();

   
    for (int i = 0; i < number.length; i++) {
      number [i] = r1.nextInt(100);
   }
 
    System.out.println(Arrays.toString(number)); 
     
  
    	int ls[] = number ; 
    	
    	int i = 0, j = 0, tmp = 0; 
    	for (; i < ls.length; i++) {
    		
    		for (j = i + 1; j < ls.length ; j++) {
    		
    			if (ls[i] < ls[j]) {
    		
    				tmp = ls[i];
    				
    				ls[i] = ls[j];
    			
    				ls[j] = tmp;
    				
    			    }
    			
    			} 
    		} 
   
    System.out.println(Arrays.toString(ls)); 
    
}
    

}
    
