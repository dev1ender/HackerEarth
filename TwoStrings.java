import java.util.*;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		while(n>0) {
			String[] strings = sc.nextLine().split(" ");
			HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
			HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
			if(strings[0].length()==strings[1].length()) {
				for(int i=0;i<strings[0].length();i++) {
					char c = strings[0].charAt(i);
					map1.put(c, map1.getOrDefault(c, 0) + 1);
					 c = strings[1].charAt(i);
					map2.put(c, map2.getOrDefault(c, 0) + 1);
				}
				for(int i=0;i<strings[1].length();i++) {
					char c =strings[1].charAt(i);
					if(map2.get(c)!=map1.get(c)) {
						System.out.println("NO");
						break;
					}
					if(map2.get(c)==map1.get(c) && i==strings[1].length()-1)
						System.out.println("YES");
				}
				
			}
			else 
				System.out.println("NO");
			n--;
		}
		
		
		sc.close();
	}

}
