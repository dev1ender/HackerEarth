import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;

public class PlayWithNo {
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	public static void main(String args[] ) throws Exception {
				FastReader sc = new FastReader();
		        
		        int[] con = Arrays.stream(sc.nextLine().split(" ")).mapToInt(token -> Integer.parseInt(token)).toArray();
		        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(token -> Integer.parseInt(token)).toArray();
		        
		        
		        while(con[1]>0){
		            con[1]--;
		            int[] lim = Arrays.stream(sc.nextLine().split(" ")).mapToInt(token -> Integer.parseInt(token)).toArray();
		            int sum =0;
		            for (int i = lim[0]-1;i<lim[1];i++){
		                sum=sum+arr[i];
		            }
		            int div = lim[1]-lim[0]+1;
		            System.out.println(sum/div);
		        }

    }
}
