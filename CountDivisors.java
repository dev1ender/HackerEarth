import java.util.Scanner;

public class CountDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int i =  sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int count=0;
		for(int a=i;a<=j;a++) {
			if(a%k==0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
