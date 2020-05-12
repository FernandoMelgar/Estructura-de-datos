package com.actividad05;

import java.util.Stack;
// 2 4 + 3 /
// 24 * 5 -
// 2 3 4 * 5 * -

public class PosfixStacks {

  public static double evaluatePosfix(String expression) {
    Stack<Double> intItems = new Stack<>();
    Stack stack = invertStackByArray(expression.split(" "));
    while(stack.size() > 0 ){
      Object item = stack.pop();
      if (item instanceof Double){
        intItems.add((Double) item);
      } else{
        intItems.add(executeOperation(intItems.pop(), intItems.pop(), (String) item));
      }
    }
    return intItems.pop();
  }

  private static double executeOperation(double number1, double number2, String operand) {
    switch (operand){
      case "+":
        return number1 + number2;
      case "-":
        return number2 - number1;
      case "/":
        return number2 / number1;
      case "*":
        return number1 * number2;
      case "^":
        return Math.pow(number2, number1);
      default:
        throw new UnsupportedOperationException();
    }
  }

  private static Stack invertStackByArray(String[] array) {
    Stack ss = new Stack();
    for (int i = array.length - 1; i >= 0 ; i--) {
      try {
        Double ex = Double.parseDouble(array[i]);
        ss.push(ex);
      }catch (NumberFormatException e){
        ss.push(array[i]);
      }
    }
    return ss;
  }
}
