//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    public void sort012(int[] arr) {
        int n = arr.length;
        int i = 0;
        int zeros = -1;
        int twos = n;

        while (i < twos) {
            if (arr[i] == 0) {
                zeros++;
                swap(arr, zeros, i);
                i++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                twos--;
                swap(arr, i, twos);
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends