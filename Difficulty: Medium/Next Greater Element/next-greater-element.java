//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().nextLargerElement(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
                System.out.println("~");
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        // ArrayList<Integer>result=new ArrayList<>(collections.ncopies);
        // Stack<Integer>st=new Stack<>();
        
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, -1)); // Initialize with -1
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) { // Fix condition
                int t = st.pop();
                result.set(t, arr[i]); // Assign NGE correctly
            }
            st.push(i); // Push index
        }

        return result; // Return result after processing
    }

        // for(int i=0;i<n;i++){
        //     if(st.size()==0){
        //         st.push(i);
        //     }else if(arr[st.top]>=arr[i]){
        //         st.push(i);
        //     }else{
        //         while(st.size()>0&&arr[st.top()]<arr(i)){
        //             int t=st.top();
        //             st.pop();
        //             result[t]==arr[i];
        //         }
        //         st.push();
        //     }
        // }while(st.size()>0){    
        //     int t=st.top();
        //     st.pop();
        //     result[t]=-1;
        // }retuern ans;
        // code here
    
}