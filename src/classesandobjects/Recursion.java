package classesandobjects;

public class Recursion {

	public static void main(String[] args) {
		int x = sum(10);
		System.out.println(x);
	
	}
public static int sum(int k) {
	if(k>0) {
		return k + sum(k-1);
			}else {
				return 0;
			}
}

		
}

