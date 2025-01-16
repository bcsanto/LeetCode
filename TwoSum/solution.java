/*
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
*/ 

public class solution { // Logic begins here
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
    solution solution = new solution();
    int[] nums = {3,2,5,3};
    int target = 6;

    int[] result = solution.twoSum(nums, target);
    System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}