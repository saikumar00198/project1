package project1;

public class Multidimesion {

	public static void main(String[] args) {
		
	}
public void twoDArrays() {
	int row = 3;
	int col = 3;
	int[][] table = new int[row][col];
	table[0][0] = 25;
	table[0][1] = 26;
	table[0][2] = 27;
	table[1][0] = 28;
	table[1][1] = 29;
	table[1][2] = 30;
	table[2][0] = 31;
	table[2][1] = 32;
	table[2][2] = 33;
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print("" +table[i][j]);
		
		}
		
	}
}
}
