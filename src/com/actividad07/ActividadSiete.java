package com.actividad07;

public class ActividadSiete {

  public boolean array6(int[] nums, int index) {
    if(nums.length == 0) return false;
   if (nums.length - 1 == index) return nums[index] == 6;
   else if (nums[index] == 6) return true;
   else return array6(nums, ++index);
  }

  public int array11(int[] nums, int index) {
    if (nums[index] == 1) return 1;
    return array11(nums, index);
  }

  public static void main(String[] args) {
    ActividadSiete siete = new ActividadSiete();
    System.out.println("true " + siete.array6(new int[]{1,6,3,4},0));
  }



}
