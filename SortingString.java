package arrays;
public class SortingString { 
    public static void main(String args[]) 
    { 
    	System.out.println(findX(5, 2)); 
    } 
    private static int findX(int n, int k) 
    { 
        int r = n, v, u; 
  
        int m = (int)Math.sqrt(k) + 1; 
        for (int i = 2; i <= m && k > 1; i++) { 
            if (i == m) { 
                i = k; 
            } 
            for (u = v = 0; k % i == 0; v++) { 
                k /= i; 
            } 
  
            if (v > 0) { 
                int t = n; 
                while (t > 0) { 
                    t /= i; 
                    u += t; 
                } 

                r = Math.min(r, u / v); 
            } 
        } 
  
        return r; 
    } 
  
}