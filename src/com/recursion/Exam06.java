package com.recursion;

public class Exam06 {

  public  static boolean misterio(int[] nums, int index){
    if (index >= nums.length - 1) return true;
    return nums[index] * 10 == nums[index + 1] && misterio(nums, index + 1);
  }

  public static void main(String[] args) {
    System.out.println(misterio(new int[0], 0));;
  }
}
