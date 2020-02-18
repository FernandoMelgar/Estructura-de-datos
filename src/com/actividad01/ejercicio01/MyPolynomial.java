package com.actividad01.ejercicio01;

import java.util.Arrays;

import static java.lang.Math.*;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        String asString = "";
        for (int i = coeffs.length - 1; i > 0 ; i--)
            asString += coeffs[i] + "x^" + i + " + ";
        asString += coeffs[0];
        return asString;
    }
    public double evaluate(double value){
        double result = coeffs[0];
        for (int i = 1; i < coeffs.length; i++)
                result += pow(value, i) * coeffs[i];
        return result;
    }
    public MyPolynomial add(MyPolynomial right){
        double[] maxCoeffs;
        double[] minCoeffs;
        if (coeffs.length >= right.coeffs.length){
            maxCoeffs = coeffs;
            minCoeffs = right.coeffs;
        } else {
            maxCoeffs = right.coeffs;
            minCoeffs = coeffs;
        }
        double[] result = new double[maxCoeffs.length];
        for (int i = 0; i < minCoeffs.length; i++)
            result[i] = maxCoeffs[i] + minCoeffs[i];
        for (int i = minCoeffs.length; i < maxCoeffs.length ; i++)
            result[i] = maxCoeffs[i];
        right.coeffs = result;
        return right;
    }
    public MyPolynomial multiply(MyPolynomial right){
        double[] maxCoeffs;
        double[] minCoeffs;
        if (coeffs.length >= right.coeffs.length){
            maxCoeffs = coeffs;
            minCoeffs = right.coeffs;
        } else {
            maxCoeffs = right.coeffs;
            minCoeffs = coeffs;
        }
        double[] result = new double[maxCoeffs.length];
        for (int i = 0; i < minCoeffs.length; i++)
            for (int j = 0; j < maxCoeffs.length; j++)
                result[j] += minCoeffs[i] * maxCoeffs[j];
        right.coeffs = result;
        return right;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }
}