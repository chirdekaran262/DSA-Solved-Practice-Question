package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPermu {
    public static void main(String[] args) {
        int nums[] = {3, 1, 2};
        Solution s = new Solution();
        s.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        for(int i= nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(nums,0);
        }
        else{
            for(int i=nums.length-1;i>ind1;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }
            swap(nums,ind1,ind2);
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[i]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }

    }
}

