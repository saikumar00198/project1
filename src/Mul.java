
public class Mul {

	public static void main(String[] args) {
		Mul a = new Mul();
		int z = a.sub(20,10);
		System.out.println("the value of Sub is "+z);
		
       String name = "Sai";
		
		System.out.println(name);
		
		int x = 20;
		int y = 20;
		System.out.println(x>=y);
				
		boolean b = 10>11;
		System.out.println(b);
		
		int r = 25;
		if (r<20) {
			System.out.println("The value of r is true");
		}else {
			System.out.println("The value of r is False");
			System.out.println("");
			
			System.out.println("++++++++ Switch+++++++++");
			
				
			}
		int day = 7;
		switch (day) {
		case 3 :
		 System.out.println("Monday");
		 break;
		 
		case 5 :
			 System.out.println("tuesday");
			 break;
		default:
		    System.out.println("Looking forward to the Weekend");
		
		    System.out.println("");
		    
		    System.out.println("++++++++ While+++++++++");
		    
		    int i=0;
		    while(i<=5) {
		    	System.out.println(i);
		    	i++;
		    	
		    }
		    System.out.println("");
	    	System.out.println("++++++++ for LOOP +++++++++");
				}
			for( int d=10; d>5; d--) {
				System.out.println(d);
			}
		}
		
		
	
    
	public int sub(int x, int y) {
		int z = x-y;
		return z;
	}
		
		
		
			
		
		}
		
		
	

