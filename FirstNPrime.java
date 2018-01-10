import java.util.Scanner;

public class FirstNPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("2");
		for (int i=3;i<=n;i++) {
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
				else if(j==i-1) {
					System.out.print(" "+i);
				}
				
			}
			
		}
		sc.close();
	}

}
