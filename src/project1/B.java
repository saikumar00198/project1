package project1;

public class B {

	static int i = 100;
	static int j = 200;
	
	public static void main(String[] args) {
		B a = new B();
		B b = new B();
		B c = new B();
		int z = a.sum(10, 20);
		int w = b.mul(2,5);
		int v = c.div(6,2);
	
		
			
		System.out.println("Sum of value is "+z);
		System.out.println("Mul of value is "+w);
		System.out.println("Div of value is "+v);
		System.out.println(a.sum(12, 16));
		System.out.println(b.mul(15, 2));
		System.out.println(b.div(15, 2));
		
		String p = a.returnString();
		System.out.println(p);
		System.out.println("");
		System.out.println(a.returnString());
		
		
		System.out.println(a.trueorFalse());
		
		a.test();
		a.printname("sai");
		a.printname("Lucky");
		a.printname("Bala");
		
		
		a.increaseIvalue();
		B.addnumber();
		B.addnumber();
		
		
		int t = B.i;
		System.out.println(t);
		
		
		
		
		
		
		
				
	}
	
	public int sum(int x, int y) {
		int z = x+y;
		return z;
	}
		
	
	
	public int mul(int x, int y) {
		int w = x*y;
		return w;
	}
	
	public int div(int x, int y) {
		int v = x/y;
		return v;
	}
	
	public String returnString() {
		String x = "Good Morning";
		return x;
		
	}
	
	public boolean trueorFalse() {
		
		return false;
	}

	public void test() {
		
		int x = 25;
		int y = 32;
		int z = x+y;
		
		System.out.println("");
		System.out.println(z);
	}
	
	public void printname(String name) {
		System.out.println(name);
	}
	
	public static void addnumber() {
		int z = i+j;
		System.out.println(z);
	}
	
	public void increaseIvalue() {
		i++;
		System.out.println(i);
	}
}



