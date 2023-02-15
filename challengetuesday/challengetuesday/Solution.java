package challengetuesday;

import java.util.Arrays;

public class Solution {
    public static void pancakeSort(int[] inputArray) {
        for(int i = inputArray.length;i > 1;--i) {
            int index = find(inputArray, i);
            if(index != i - 1) {
                flip(inputArray, index);
                flip(inputArray, i - 1);
            }
        }   
    }
    
    private static int find(int[] A, int target) {
        int i,j;
        for(i = 0,j = 0;j < target;j++) {
            if (A[j] > A[i]) {
                i = j;
            }
        }
      return i;

    }
    private static void flip(int[] A, int index) {
        int temp = 0;
        int start = 0;
        int j = index;
            
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
