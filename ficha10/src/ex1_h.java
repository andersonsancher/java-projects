
public class ex1_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		
		for(int l=1; l<=n; l++) {
			for(int c=1; c<=n; c++) {
				if(c==n-2 || l==n-2  ) {
					System.out.print("0");
			
				}
				else
					System.out.print("1");
			}
			System.out.print("\n");
		}
	
		
	}

}
