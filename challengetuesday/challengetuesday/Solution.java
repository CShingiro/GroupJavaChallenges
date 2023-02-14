package challengetuesday;

import java.util.Arrays;

public class Solution {
    public static void pancakeSort(int[] inputArray) {
        
    }
    
    private static int find(int[] A, int target) {
      
    }
    private static void flip(int[] A, int index) {
        int[] arr = Arrays.copyOf(A, index + 1);
        Arrays.sort(arr);
    }

    public static void main(String[] args){
        int[] arr = {3,2,4,1};
        pancakeSort(arr);
    }
}
