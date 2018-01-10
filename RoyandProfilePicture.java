import java.util.Scanner;

public class RoyandProfilePicture {

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int l = sc.nextInt();
			
			int n = sc.nextInt();
			while(n>0) {
				int len = sc.nextInt();
				int width = sc.nextInt();
				if(len>l&&width>l) {
					if(width==len) {
						System.out.println("ACCEPTED");
					}
					else
					System.out.println("CROP IT");
					
				}
				else if(len>l || width >l) {
					System.out.println("UPLOAD ANOTHER");
				}
				
			}
			
			sc.close();
		}

}
