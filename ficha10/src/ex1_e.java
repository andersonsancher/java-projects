
public class ex1_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n=4;
		
		for(int l=1; l<=n; l++) {
			for(int c=1; c<=n; c++) {
				if(l+c==n+1 ) {
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		
	}

}
