//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            Solution ob = new Solution();
            int res = ob.binarysearch(arr, k);
            System.out.println(res);

            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public int binarysearch(int[] arr, int k) {
        int ans = Integer.MAX_VALUE;
        int s = 0;
        int e = arr.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == k) {
                ans = Math.min(ans, mid);
                e = mid - 1; // Move to the left to find the first occurrence
            } else if (arr[mid] > k) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        
        if (ans == Integer.MAX_VALUE) {
            return -1; // Element not found
        } else {
            return ans;
        }
    }
}
