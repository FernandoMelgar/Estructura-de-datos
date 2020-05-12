package com.examen02;

public class Palindrome {
  public static boolean isPalindrome(String text){
    return isPalindromeRecursive(text.replace(" ",""));

  }

  public static boolean isPalindromeRecursive(String text){
    int length = text.length();
    if (length == 1) return true;
    if (length == 2) return text.charAt(0) == text.charAt(1);
    if (text.charAt(0) == text.charAt(length - 1)) return isPalindrome(text.substring(1, length - 1));
    else return false;
  }

  public static void main(String[] args) {
    System.out.println("isPalindrome(\"an\") = " + isPalindrome("an"));
  }
}
