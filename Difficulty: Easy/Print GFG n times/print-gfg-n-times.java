//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printGfg(n);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    static void printGfg(int N) {
        // code here
        if(N==0){
            return;
        }
        System.out.print("GFG"+" ");
        printGfg(N-1);
    }
        public static void main(String[] args) {
        Solution s=new Solution();
        int N=9; // Example input
        printGfg(N); // Call the recursive function
    }
}