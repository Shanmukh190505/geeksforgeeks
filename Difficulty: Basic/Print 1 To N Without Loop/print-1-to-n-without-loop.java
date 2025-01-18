//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            // creating an object of class Print
            Solution obj = new Solution();
            int N;

            // input N
            N = sc.nextInt();

            // calling printNos() methdo
            // of class Print
            obj.printNos(N);
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public void printNos(int n) {
        // Base case: stop recursion when n is 0
        if (n == 0) {
            return;
        }

        // Recursive call for smaller numbers
        printNos(n - 1);

        // Print the current number after the recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10; // Example input
        solution.printNos(n);
    }
}

