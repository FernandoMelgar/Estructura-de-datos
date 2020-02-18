package com.actividad01.ejercicio01;

import java.util.Arrays;

public class TestMyPolynomial {

  public static void main(String[] args) {
    testOnlyOnesDegreeAndEvaluation();
    testStringFormat();
    testSumOfPolynomials();
    testMultiplicationOfPolynomials();

  }

  private static void testSumOfPolynomials() {
    MyPolynomial py3 = new MyPolynomial(1,2,3);
    MyPolynomial py4 = new MyPolynomial(1,2);
    if (Arrays.equals(py3.add(py4).getCoeffs(), new double[]{2,4,3}))
      System.out.println("OK: testSumOfPolynomials: [1 2 3] + [1 2] = [2 4 3]");
    else
      System.out.println("ERROR: testSumOfPolynomials: [1 2 3] + [1 2] = [2 4 3]");
  }
  private static void testMultiplicationOfPolynomials() {
    MyPolynomial py3 = new MyPolynomial(1,2,3);
    MyPolynomial py4 = new MyPolynomial(1,2);
    if (Arrays.equals(py3.multiply(py4).getCoeffs(), new double[]{3, 6, 9}))
      System.out.println("OK: testSumOfPolynomials: [1 2 3] * [1 2] = [3 6 9]");
    else
      System.out.println("ERROR: testSumOfPolynomials: [1 2 3] * [1 2] = [3 6 9]");
  }

  private static void testStringFormat() {
    MyPolynomial py2 = new MyPolynomial(1,2,3);
    if (py2.toString().equals("3.0x^2 + 2.0x^1 + 1.0"))
      System.out.println("OK: testStringFormat");
    else
      System.out.println("ERROR: testStringFormat");
  }

  private static void testOnlyOnesDegreeAndEvaluation() {
    MyPolynomial py1 = new MyPolynomial(1,1,1);
    if (py1.getDegree() == 2)
      System.out.println("OK: testOnlyOnesDegreeAndEvaluation, Degree Test");
    else
      System.out.println("ERROR: testOnlyOnesDegreeAndEvaluation, Degree Test");
    if (py1.evaluate(1) == 3)
      System.out.println("OK: testOnlyOnesDegreeAndEvaluation, Evaluation in 1");
    else
      System.out.println("ERROR: testOnlyOnesDegreeAndEvaluation, Evaluation in 1");
    if (py1.evaluate(2) == 7)
      System.out.println("OK: testOnlyOnesDegreeAndEvaluation, Evaluation in 2");
    else
      System.out.println("ERROR: testOnlyOnesDegreeAndEvaluation, Evaluation in 2");
  }
}
