package iNeuron;

public class Pattern3 {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( (i==0 && j>0 && j<(3*n)/4) || (j==0 && i>0 && i<n-2)|| (i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) 
					|| (j==(3*n)/4 && i>=(n-1)/2 && i<=(3*n)/4) || (i==n-2 && j<(n-1)/2) ||
					 (j==(n-1)/2) && i>=(n-1)/2  && i<n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
