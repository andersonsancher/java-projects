
public class ex1_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n=4;
		
		for(int l=1; l<=n; l++) {
			for(int c=1; c<=n; c++) {
				if(c==n || l==n ) {
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
