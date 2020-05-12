package com.actividad06;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Integer[] arr1 = { 4, 2, 7, 5, 9, 1, 9, 4 };
    Double[] arr2 = { 1.1, 2.0, 2.3, 4.5, 5.5,7.7,9.7, 13.1 };
    String[] arr3 = {"ahi", "escuchan", "estan", "me", "oyen", "siempre"};

//    System.out.println("Linear search in array1 = " + Arrays.toString(arr1));
//    System.out.println("Search 2: " + linearSearch(arr1, 2)); //1
//    System.out.println("Search 4: " + linearSearch(arr1, 4)); //0
//    System.out.println("Search 1: " + linearSearch(arr1, 1)); //5
//    System.out.println("Search 42: " + linearSearch(arr1, 42)); //-1
//
    System.out.println("Binary search in array2 = " + Arrays.toString(arr2));
/*
    System.out.println("Search 1.1: " + binarySearch(arr2, 1.1)); //0
    System.out.println("Search 2.0: " + binarySearch(arr2, 2.0)); //1
    System.out.println("Search 2.3: " + binarySearch(arr2, 2.3)); //2
    System.out.println("Search 4.5: " + binarySearch(arr2, 4.5)); //3
    System.out.println("Search 5.5: " + binarySearch(arr2, 5.5)); //4
    System.out.println("Search 9.7: " + binarySearch(arr2, 9.7)); //4
*/
    System.out.println("Search 42.0: " + binarySearch(arr2, 42.0)); //-1

    System.out.println("Binary search in array3 = " + Arrays.toString(arr3));
    System.out.println("Search 'ahi': " + binarySearch(arr3, "ahi")); //0
    System.out.println("Search 'escuchan': " + binarySearch(arr3, "escuchan")); //1
    System.out.println("Search 'estan': " + binarySearch(arr3, "estan")); //2
    System.out.println("Search 'me': " + binarySearch(arr3, "me")); //3
    System.out.println("Search 'oyen': " + binarySearch(arr3, "oyen")); //4
    System.out.println("Search 'siempre': " + binarySearch(arr3, "siempre")); //5
    System.out.println("Search 'feliz': " + binarySearch(arr3, "feliz")); //-1

    try{
      System.out.println("Search unordered: " + binarySearch(arr1, 1));
    }catch(IllegalArgumentException e){
      System.out.println("Cannot perform binary search in unordered array!");
    }
  }

  public static <T> int linearSearch(T[] a, T item){
    for (int i = 0; i < a.length; i++)
      if (item.equals(a[i])) return i;
    return -1;
  }

  public static <T extends Comparable<? super T>> int binarySearch(T[] a, T item){
    if ( !isOrdered(a) ) throw new IllegalArgumentException("Array needs to be sorted");
    return validBinarySearch(a, item);
  }

      private static <T extends Comparable<? super T>> int validBinarySearch(T[] a, T item) {
        int top = a.length - 1; int bottom = 0; int i = 0;
        while (bottom != top) {
          i = (bottom + top) / 2;
          if (item.compareTo(a[i + 1]) >= 0)  bottom = i;
          else top = i;
          if (item.equals(a[i]))
            return i;
        }
        return (item.equals(a[i])) ? i: -1;
      }

  public static <T extends Comparable<? super T>> boolean isOrdered(T[] a) {
    return isOrdered(a, 0);
  }

  public static <T extends Comparable<? super T>> boolean isOrdered(T[] a, int n) {
    if (a.length - 1 == n){  //caso base
      return true;
    }
    return a[n].compareTo(a[n + 1]) <= 0 && isOrdered(a, n + 1);
  }
}