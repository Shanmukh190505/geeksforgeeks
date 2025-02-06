//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    public int getSecondLargest(int[] arr) {
        // // Check if array has less than 2 elements
        // if (arr.length < 2) {
        //     return -1; // Not enough elements for second largest
        // }

        // // Sort the array
        // Arrays.sort(arr);

        // // Traverse from the second last element to find the first distinct smaller element
        // for (int i = arr.length - 2; i >= 0; i--) {
        //     if (arr[i] != arr[arr.length - 1]) {
        //         return arr[i]; // Second largest element found
        //     }
        // }

        // // If no second largest distinct element is found
        // return -1;
        int lar=-1;
        int seclar=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }for(int i=0;i<arr.length;i++){
            if(arr[i]>seclar && arr[i]!=lar){
                seclar=arr[i];
            }
        }
        return seclar;
    }
}
