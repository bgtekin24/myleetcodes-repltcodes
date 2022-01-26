/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

*/

class Solution {
    public int[] twoSum(int[] nums, int target)         {
        int [] arr = new int [2];
        for (int a=0; a<nums.length-1; a++)       {
            for (int b=a+1; b<nums.length; b++) {
                if (nums[a]+nums[b]==target)    {
                arr[0]=a;
                arr[1]=b;
                }
            }
        }
    return arr;
    }
}

//   To watch my video at: https://www.loom.com/share/4291105220614cea90d919e92fbda0b2
