package challengetuesday;

import java.util.Arrays;

public class Solution {
    public static void pancakeSort(int[] inputArray) {
        
    }
    
    private static int find(int[] A, int target) {
      
    }
    private static void flip(int[] A, int index) {
        int temp = 0;
        int start = 0;
        int j = index + 1;
        while(start < j) {
            temp = A[start];
            A[start] = A[j];
            A[j] = temp;
            start++;
            j--;
            System.out.println(Arrays.toString(A));
        }
    }

    public static void main(String[] args){
        int[] arr = {3,2,4,1};
        pancakeSort(arr);
    }
}
