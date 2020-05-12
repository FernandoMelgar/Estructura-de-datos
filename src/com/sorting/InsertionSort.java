package com.sorting;

import java.util.Arrays;

public class InsertionSort<E extends Comparable< ? super E>> {

  private E[] sort(E[] array){
    for (int i = 1; i < array.length; i++) {
      E key = array[i];
      int j = i - 1;
      while (j > 0 && key.compareTo(array[j]) < 0){
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[i] = key;
    }
    return array;
  }

  public static void main(String[] args) {
    InsertionSort<Integer> integerInsertionSort = new InsertionSort<>();
    Integer[] sortedArray = integerInsertionSort.sort(new Integer[]{3,2,1});
    System.out.println(Arrays.toString(sortedArray));
  }
}
