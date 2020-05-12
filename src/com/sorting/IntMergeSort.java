package com.sorting;

import java.util.Arrays;

import static java.lang.System.*;

public class IntMergeSort {


  private Integer[] mergeSort(Integer[] array){
    if (array.length < 2) return null;
    int m = array.length / 2;
    Integer[] l = new Integer[m];
    Integer[] r = new Integer[array.length - m];
    arraycopy(array, 0, l, 0, m);
    arraycopy(array, m, r, 0, array.length - m);

    mergeSort(l);
    mergeSort(r);
    return merge(array, l,r);
  }

  private Integer[] merge(Integer[] array, Integer[] l, Integer[] r) {
    int i = 0, j = 0, k = 0;
    while(i < l.length && j < r.length){
      if (l[i] <= r[j])
        array[k++] = l [i++];
      else
        array[k++] = r[j++];
    }
    while (i < l.length)
      array[k++] = l[i++];
    while (j < r.length)
      array[k++] = r[i++];
    return array;
  }

  public static void main(String[] args) {
    IntMergeSort intMergeSort = new IntMergeSort();
    Integer[] sorted = intMergeSort.mergeSort(new Integer[]{9,8,7,6,5,4,3,2,1});
    out.println("sorted = " + Arrays.toString(sorted));
  }
}
