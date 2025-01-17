//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
        static int gcd(int a, int b){
            if(b==0){
                return a;
            }else{
                return gcd(b,a%b);
            }

        }

    public static int[] lcmAndGcd(int a, int b) {
        // code here
            int re=gcd(a,b);
            int lcm;
            lcm=Math.abs(a*b)/re;
            return new int[] {lcm,re};

    }
}

//{ Driver Code Starts.

// } Driver Code Ends