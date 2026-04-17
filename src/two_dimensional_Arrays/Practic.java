package two_dimensional_Arrays;

public class Practic {
	public static void twoDArrays() {
		//2d array : an array of arrays
		/*
		{
		  {0,1,2},
		  {4,5,6},
		  {7,8,9}
		}
		*/
		String[][] aliens = new String[3][3];
		
		aliens[0][0] = "four-arms";
		aliens[0][1] = "xlr8";
		aliens[0][2] = "heatBlast";
		aliens[1][0] = "greymatter";
		aliens[1][1] = "diamond-head";
		aliens[1][2] = "chromastone";
		aliens[2][0] = "rip-jaw";
		aliens[2][1] = "swapfire";
		aliens[2][2] = "ghostFreak";
		
		//iteratiing through 2d Array
		
		for(int i=0;i<aliens.length;i++) {
			for(int j=0;j<aliens[i].length;j++) {
				System.out.print(aliens[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void twoDArrays1() {
		int[][] num = {
				{0,1,2},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		//twoDArrays();
		twoDArrays1();
	}
}
