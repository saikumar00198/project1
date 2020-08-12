package project1;

public class D {

	public static void main(String[] args) {
		int i=10;
		while(i<20) {
			System.out.println(++i);
			i++;
		}
		System.out.println("++++++Do While+++++++++++");
		
		int j=2;
		
		do {
			System.out.println(j);
			j++;
		}while(j<5);
		
		System.out.println("++++++for loop+++++++++++");
		for(int k=0;k<5;k++) {
			System.out.println(k);
		}
		System.out.println("++++++Nested For Loop+++++++++++");
		for(int outer=0;outer<3;outer++) {
			for(int inner=0;inner<3;inner++) {
				System.out.println("outer is + "+outer + " inner is +"+inner);
			}
			
		}
		System.out.println("++++++Break+++++++++++");
		for(int l=0;l<5;l++) {
			if(l>2) {
				break;
			}
			System.out.println(l);
		}
		System.out.println("++++++Continue+++++++++++");
		for (int n=0;n<6;n++) {
			if(n>=7) {
				continue;
			}
			System.out.println(++n);
		}
	}

}
