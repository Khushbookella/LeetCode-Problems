/*
Problem: 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 */



public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
	      
        int sum[] = new int[2];
        
        for( int i = 0;i<nums.length;i++)
        {
              int temp = nums[i];
              for (int j =i; j<nums.length-1;j++)
              {
               	  temp = temp+nums[j+1];
            
               	  if(temp==target)
               	  { 
               		  sum[0]= i;
               		  sum[1]=j+1;
               		  break;
               	  }
               	  else 
               		  temp=nums[i];
              }
            
               
           }
        return sum ;
        
    }
	
}